package LongestConsecutiveSequence;

public class Main {
    public static void main(String[] args) {
    longestConsecutiveSequence solucao = new longestConsecutiveSequence();

    int[] nums = new int[5];
    nums[0] = 2;
    nums[1] = 12;
    nums[2] = 0;
    nums[3] = 0;
    nums[4] = 0;

        System.out.println(solucao.longestConsecutiveSequence(nums));

    }
}
