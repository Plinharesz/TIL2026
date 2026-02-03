Primeiro metodo= 

1- Verificacao inicial:

se o numero da string for diferente, automaticamente ja retorna como false, pois é impossivel ser um anagrama se nao tiver pelo menos o mesmo numero de caracteres

2- Logica:

2.1- separar o array em chars -> 

char[] fulano = listaA.toCharArray();

char[] ciclano = listaB.toCharArray();

2.2- Ordenar os caracteres: Arrays.sort()

2.3- return Arrays.equals(a,b) -> retorna automaticamente true ou false




                              