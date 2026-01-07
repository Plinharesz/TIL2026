import java.util.Arrays;

public class hasDuplicate {
    public boolean hasDuplicate_sorting (int[] nums) {
        Arrays.sort(nums);

        for (int i=1; i< nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return false;
            }
        }
        return true;
    }
}

