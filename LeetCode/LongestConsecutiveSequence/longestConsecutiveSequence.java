package LongestConsecutiveSequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    public int longestConsecutiveSequence (int[] nums) {
        Set<Integer> lista = new HashSet<>();
        for (int num : nums) {
            lista.add(num);
        }

        int maiorSequencia = 0;

















        for (int i=0; i< lista.size(); i++) {
            for (int j=1; j< lista.size(); j++) {
                if (lista[j] == lista[i] +1) {
                    contador++;
                }
            }
        }
    }
}
