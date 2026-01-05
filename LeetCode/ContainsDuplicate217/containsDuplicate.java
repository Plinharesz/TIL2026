import java.util.Arrays;

public class containsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);                      // Put numbers in order
        for (int i=1; i<nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }
}
