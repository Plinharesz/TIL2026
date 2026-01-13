import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {

        // 2. Criando o HashSet
        Set<Integer> lista = new HashSet<>();

        // 3. Adicionando valores
        lista.add(10);
        lista.add(20);
        lista.add(10); // O HashSet ignora, pois o 10 já existe!

        // 4. Verificando o tamanho
        System.out.println(lista.size());
    }
}
