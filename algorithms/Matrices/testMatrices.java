public class TestMatrices {

    public static void main(String[] args) {

        // Criando matriz ja inicializada 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Criando matriz informando tamanho
        int[][] matriz2 = new int[3][4]; // 3 linhas, 4 colunas

        // Como acessar valores da matriz
        int valor = matriz[0][1]; // linha 0, coluna 1

        // Como saber o tamanho da matriz
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        System.out.println("Linhas: " + linhas);
        System.out.println("Colunas: " + colunas);
        System.out.println("Valor matriz[0][1]: " + valor);

        // Percorrendo a matriz (forma clássica)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Percorrendo com for-each
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.println(valor + " ");
            }
            System.out.println();
        }

        // Preenchendo a matriz dinamicamente
        int contador = 1;

        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = contador++;
            }
        }

        // Somar todos os elementos da matriz
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }

        // Somar apenas uma linha específica
        int linha = 1;
        int somas = 0;

        for (int j = 0; j < matriz[linha].length; j++) {
            somas += matriz[linha][j];
        }

        // Somar apenas uma coluna específica
        int coluna = 2;
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][coluna];
        }
    }
}
