package arrays;

public class TesteArrays {
    public static void main(String[] args) {
        // 1. Criacao da Array com tamanho 5.
        int[] notas = new int[5];

        // 2. Inserção: adicionando valores nas arrays.
        notas[0] = 10;
        notas[1] = 3;
        notas[4] = 92;
        // 3. Leitura dos valores atuais.
        System.out.println("Nota do primeiro aluno X: " + notas[0]);

        // 4. Modificação de valores.
        notas[0] = 4;
        System.out.println("Nota do primeiro aluno X depois da mudanca: " + notas[0]);

        // PERCORRENDO
        System.out.println("Todas as notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + " ");
        }



    }
}