public static void main(String[] args) {
    // 1. Definir os dados de teste (TestCase)
    int[] listaNumeros = {2, 7, 11, 15};
    int objetivo = 9;

    // 2. Instanciar a classe (criar o objeto)
    // Precisamos fazer isso porque o métod twoSum não é "static"
    twoSum solucao = new twoSum();

    // 3. Rodar o métod e guardar o resultado
    int[] resultado = solucao.twoSum(listaNumeros, objetivo);

    // 4. Imprimir o resultado (sout)
    // OBS: Usamos Arrays.toString() para transformar o array em texto legível
    System.out.println("Resultado: " + Arrays.toString(resultado));
}

