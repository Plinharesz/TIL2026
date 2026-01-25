public class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] preff = new int[n];
        int[] suff = new int[n];
        int[] result = new int[n];

        preff[0] = 1;
        suff[n-1] = 1;

        for (int i=1; i<nums.length; i++) {
            preff[i] = nums[i-1] * preff[i-1];
        }
        for (int i=n-2; i>=0; i--) {
            suff[i] = nums[i+1] * suff[i+1];
        }
        for (int i=0; i< nums.length; i++) {
            result[i] = preff[i] * suff[i];
        }
        return result;
    }
}
