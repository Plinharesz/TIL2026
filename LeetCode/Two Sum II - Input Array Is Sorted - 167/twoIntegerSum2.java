public class twoIntegerSum2 {
    public int[] twoSum2 (int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer < rightPointer) {
            int curSum = nums[leftPointer] + nums[rightPointer];

            if (curSum > target) {
                rightPointer--;
            }
            else if (curSum < target) {
                leftPointer++;
            }
            else {
                return new int[] {leftPointer+1, rightPointer+1};
            }
        }
        return new int[0];
    }
}
