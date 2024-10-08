package asadolahi.hosein.slidingwindow.q1;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0;
        for (int i = 0; i < k; i++) {
            max += nums[i];
        }
        double sum = 0;
        for (int i = 1; i <= nums.length - k; i++) {
            sum += nums[i + k - 1] - nums[i - 1];
            max = Math.max(max, sum);
        }
        return max / k;
    }
}
