import java.util.Arrays;

// Teste!!!!


public class validPalindrome {
    public boolean isPalindrome(String s) {

        String beginString = s.substring(0, s.length()/2);
        String finalString = s.substring(s.length()/2);

        char[] charBegin = beginString.toCharArray();
        char[] charFinal = finalString.toCharArray();

        Arrays.sort(charBegin);
        Arrays.sort(charFinal);

        if (charBegin == charFinal) {
            return true;
        }
        return false;
    }
}
