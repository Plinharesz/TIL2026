public class trappingWater {
    public int trap(int[] height) {
        // Verifica se o array é nulo ou vazio, retornando 0 pois não há como reter água.
        if (height == null || height.length == 0) {
            return 0;
        }

        // Inicializa os ponteiros: 'left' no início e 'right' no final do array.
        int left = 0;
        int right = height.length - 1;

        // Variáveis para armazenar a altura máxima vista até o momento
        // a partir da esquerda (maxLeft) e da direita (maxRight).
        int maxLeft = 0;
        int maxRight = 0;

        // Variável para acumular o total de água retida.
        int totalWater = 0;

        // Loop principal que continua enquanto os ponteiros não se cruzarem.
        while (left < right) {
            // Se a altura na posição 'left' for menor ou igual à altura em 'right',
            // processamos o lado esquerdo. Isso é seguro porque sabemos que existe
            // uma barreira maior ou igual à direita (height[right]), então a água
            // retida depende apenas da maxLeft.
            if (height[left] <= height[right]) {
                // Se a altura atual for maior ou igual ao maxLeft, atualizamos o maxLeft.
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    // Caso contrário, a água retida é a diferença entre maxLeft e a altura atual.
                    totalWater += maxLeft - height[left];
                }
                // Movemos o ponteiro esquerdo para a direita.
                left++;
            } else {
                // Caso contrário (height[right] < height[left]), processamos o lado direito.
                // Aqui sabemos que existe uma barreira maior à esquerda (height[left]).

                // Se a altura atual for maior ou igual ao maxRight, atualizamos o maxRight.
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    // Caso contrário, a água retida é a diferença entre maxRight e a altura atual.
                    totalWater += maxRight - height[right];
                }
                // Movemos o ponteiro direito para a esquerda.
                right--;
            }
        }

        // Retorna o total de água acumulada.
        return totalWater;
    }
}
