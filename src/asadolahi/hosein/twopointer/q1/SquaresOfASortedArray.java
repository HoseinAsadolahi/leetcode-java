package asadolahi.hosein.twopointer.q1;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1, index = nums.length - 1;
        int[] res = new int[nums.length];
        while (i <= j) {
            if (Math.abs(nums[i]) < Math.abs(nums[j])) {
                res[index--] = nums[j] * nums[j];
                j--;
            } else {
                res[index--] = nums[i] * nums[i];
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}
