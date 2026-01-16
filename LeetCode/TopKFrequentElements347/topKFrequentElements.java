import java.util.HashMap;
import java.util.Map;

public class topKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num,0)+1);
        }

    }
}
