public class MainLongestConsecutiveSequence {
    public static void main(String[] args) {
    longestConsecutiveSequence solucao = new longestConsecutiveSequence();

    int[] nums = new int[8];
    nums[0] = 0;
    nums[1] = 3;
    nums[2] = 2;
    nums[3] = 5;
    nums[4] = 4;
    nums[5] = 6;
    nums[6] = 1;
    nums[7] = 1;

        System.out.println(solucao.longestConsecutiveSequence(nums));

    }
}
