// ==========================================
// 1. ABSTRAÇÃO & POLIMORFISMO (Classe Abstrata)
// ==========================================
// Abstraímos o conceito de "Pagamento".
// Não podemos instanciar um "Pagamento" genérico, apenas formas concretas dele.
abstract class Pagamento {
    // 2. ENCAPSULAMENTO
    // Atributos privados protegem o estado interno contra alterações indevidas.
    private final String idTransacao;
    private double valor;

    // Construtor
    public Pagamento(String idTransacao, double valor) {
        this.idTransacao = idTransacao;
        setValor(valor); // Uso do setter para validação de regra de negócio
    }

    // Métodos Getters e Setters protegendo as regras de negócio (Encapsulamento)
    public String getIdTransacao() {
        return idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do pagamento deve ser maior que zero.");
        }
        this.valor = valor;
    }

    // Method abstrato: Força todas as subclasses a implementar a sua própria lógica de processamento
    public abstract boolean processar();
}

// ==========================================
// 3. HERANÇA & POLIMORFISMO (Subclasse 1)
// ==========================================
// PagamentoPix herda idTransacao, valor e comportamentos de Pagamento
class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(String idTransacao, double valor, String chavePix) {
        super(idTransacao, valor); // Chama o construtor da Superclasse (Pagamento)
        this.chavePix = chavePix;
    }

    // POLIMORFISMO (Sobrescrita / Overriding)
    // Implementa o comportamento de processar especificamente para PIX
    @Override
    public boolean processar() {
        System.out.println("Gerando Payload e QR Code para a chave Pix: " + chavePix);
        System.out.println("Pagamento Pix de R$ " + getValor() + " aprovado instantaneamente!");
        return true;
    }
}

// ==========================================
// HERANÇA & POLIMORFISMO (Subclasse 2)
// ==========================================
class PagamentoCartaoCredito extends Pagamento {
    private String numeroCartao;
    private int parcelas;

    public PagamentoCartaoCredito(String idTransacao, double valor, String numeroCartao, int parcelas) {
        super(idTransacao, valor);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    // POLIMORFISMO (Sobrescrita / Overriding)
    // Implementa a lógica específica de comunicação com operadora de cartão
    @Override
    public boolean processar() {
        System.out.println("Comunicando com a adquirente para o cartão final " +
                numeroCartao.substring(numeroCartao.length() - 4));
        System.out.println("Transação de R$ " + getValor() + " autorizada em " + parcelas + "x.");
        return true;
    }
}

// ==========================================
// EXECUÇÃO DO SISTEMA
// ==========================================
public class Main {
    public static void main(String[] args) {
        // Criamos instâncias das subclasses concretas
        Pagamento pix = new PagamentoPix("TX-1001", 150.00, "pedro@email.com");
        Pagamento cartão = new PagamentoCartaoCredito("TX-1002", 450.00, "1234567890123456", 3);

        System.out.println("--- PROCESSANDO VENDAS ---");

        // POLIMORFISMO EM AÇÃO:
        // Tratamos objetos de tipos diferentes (Pix e Cartão) de forma genérica como 'Pagamento'.
        // O method processar() correto é acionado dinamicamente em tempo de execução!
        processarTransacao(pix);
        System.out.println("---------------------------");
        processarTransacao(cartão);
    }

    // Método genérico que aceita QUALQUER subclasse de Pagamento
    public static void processarTransacao(Pagamento pagamento) {
        System.out.println("Iniciando transação ID: " + pagamento.getIdTransacao());
        pagamento.processar(); // Polimorfismo pura decisão em tempo de execução
    }
}