import java.util.Arrays;

public class majorityElement {
    public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length/2];
    }
}
