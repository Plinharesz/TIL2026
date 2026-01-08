import java.util.Arrays;

public class validAnagram {
    public boolean validAnagram (String s, String t) {
        // 1- Verificação do Length
        if (s.length() != t.length()) {
            return false;
        }

        // 2- Transforma a String em Char pra manipular as letras
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // 3- Coloca em ordem alfabética
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // 4- Pergunta se as duas Strings (ordenadas) são iguals. True se sim, False se não.
        return Arrays.equals(sChars, tChars);
    }
}
