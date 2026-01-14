JAVA TIPS

- `Arrays.sort()` -> put numbers in order inside of an array.


- `.values()` -> Esse método extrai apenas os Valores do seu mapa (ignora as chaves). Ele devolve uma Collection<List<String>>. Ou seja, ele pega todos os baldes que você encheu.


- `res.putIfAbsent(sortedS, new ArrayList<>());` -> Essa linha diz: "Ei mapa res, verifique se a chave sortedS (ex: "aet") já existe. Se NÃO existir (if absent), crie uma entrada para ela com uma lista vazia (new ArrayList<>). Se já existir, não faça nada."