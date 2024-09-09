package asadolahi.hosein.slidingwindow.q2;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int zeros = 0, end = 0, start = 0;
        int n = nums.length;
        while (end < n) {
            if (nums[end] == 0) {
                zeros += 1;
            }
            end++;
            if (zeros > k) {
                start++;
                if (nums[start - 1] == 0) {
                    zeros -= 1;
                }
            }
        }
        return end - start;
    }
}
