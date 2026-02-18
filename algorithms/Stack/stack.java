import java.util.Stack;

public class stack {
    public static void main() {
        // 1. Criando a pilha
        Stack<String> pilhaDeLivros = new Stack<>();

        // push() adiciona item no topo da pilha
        System.out.println("--- 1. ADICIONANDO (PUSH) ---");
        pilhaDeLivros.push("Harry Potter");
        pilhaDeLivros.push("O Senhor dos Anéis");
        pilhaDeLivros.push("Dom Casmurro");

        // Estado atual: [Harry Potter, O Senhor dos Anéis, Dom Casmurro] (Topo)
        System.out.println("Pilha Atual: " + pilhaDeLivros);

        System.out.println("\n--- 2. ESPIANDO (PEEK) ---");
        // peek() olha quem está no topo SEM remover
        String topo = pilhaDeLivros.peek();
        System.out.println("Quem está no topo? " + topo);
        System.out.println("A pilha diminuiu? " + (pilhaDeLivros.size() < 3 ? "Sim" : "Não"));

        System.out.println("\n--- 3. REMOVENDO (POP) ---");
        // pop() remove e RETORNA o item do topo
        String livroRemovido = pilhaDeLivros.pop();
        System.out.println("Li e removi: " + livroRemovido);

        // Agora o topo mudou!
        System.out.println("Novo topo: " + pilhaDeLivros.peek());

        System.out.println("\n--- 4. VERIFICANDO VAZIO (isEmpty) ---");
        // isEmpty() retorna true ou false
        while (!pilhaDeLivros.isEmpty()) {
            System.out.println("Removendo restante: " + pilhaDeLivros.pop());
        }

        System.out.println("A pilha está vazia agora: " + pilhaDeLivros.isEmpty());
    }
}
