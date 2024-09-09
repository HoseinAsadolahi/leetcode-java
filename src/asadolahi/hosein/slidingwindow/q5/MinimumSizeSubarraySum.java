package asadolahi.hosein.slidingwindow.q5;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, min = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        for (int end = 0; end < n; end++) {
            sum += nums[end];
            while (sum >= target) {
                min = Math.min(min, end - start);
                sum -= nums[start++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min + 1;
    }
}
