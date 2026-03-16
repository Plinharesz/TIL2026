public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring (String s) {

        // Primeira tentativa (esboço da resolucao)
        // Não é a resposta final!


        char[] sChars = s.toCharArray();

        int l=0;
        int r=1;
        int contador = 1;
        int maiorSequencia = 1;

        while (l<sChars.length) {
            if (sChars[l] != sChars[r]) {
                r++;
                contador++;
                maiorSequencia = Math.max(contador, maiorSequencia);
            }
            else {
                l = r;
            }
            r++;
        }
        return maiorSequencia;
    }
}
