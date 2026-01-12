import java.util.HashMap;

public class TesteHashMap {
    public static void main(String[] args) {

        // 1. CRIAÇÃO DO HASHMAP
        HashMap<String, Integer> idades = new HashMap<>();

        // 2. INSERÇÃO (PUT)
        idades.put("Maria", 24);
        idades.put("Pedro", 23);
        idades.put("Raze", 3);

        // 3. RECUPERAÇÃO (GET)
        System.out.println("Idade da Maria: " + idades.get("Maria"));

        // 4. SOBRESCRITA
        idades.put("Pedro", 24); // Pedro fez aniversário
        System.out.println("Nova idade do Pedro: " + idades.get("Pedro"));

        // 5. VERIFICAÇÃO (IMPORTANTE PARA EX DE LEETCODE)
        // Isso checa se a chave existe sem precisar percorrer tudo

        if (idades.containsKey("Raze")) {
            System.out.println("Raze está no sistema!");
        }
        if (!idades.containsKey("Fulano")) {
            System.out.println("Fulano não está no sistema!");
        }

        //6. REMOÇÃO
        idades.remove("Pedro");
        System.out.println(idades.get("Pedro"));
    }
}
