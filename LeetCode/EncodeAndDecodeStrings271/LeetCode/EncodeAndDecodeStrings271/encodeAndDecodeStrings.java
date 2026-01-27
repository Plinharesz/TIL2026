package LeetCode.EncodeAndDecodeStrings271;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String string : strs) {
            encodedString.append(string.length());
            encodedString.append("#");
            encodedString.append(strs);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {

                int length = Integer.parseInt(str.substring(i, j));
                String word = str.substring(j + 1, j + 1 + length);
                result.add(word);
                i = j + 1 + length;
            }
        }
        return result;
    }
}
