package LongestConsecutiveSequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    public int longestConsecutiveSequence(int[] nums) {
        Set<Integer> lista = new HashSet<>();
        for (int num : nums) {
            lista.add(num);
        }

        int maiorSequencia = 0;

        for (int num: lista) {
            if(!lista.contains(num-1)) {
                int numeroAtual= num;
                int sequenciaAtual = 1;

                while (lista.contains(numeroAtual+1)) {
                    numeroAtual++;
                    sequenciaAtual++;
                }
                maiorSequencia = Math.max(maiorSequencia, sequenciaAtual);
            }
        }
        return maiorSequencia;
    }
}
















