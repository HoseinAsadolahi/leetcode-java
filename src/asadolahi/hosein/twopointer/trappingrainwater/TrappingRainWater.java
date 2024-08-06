package asadolahi.hosein.twopointer.trappingrainwater;

public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1, lmax = 0, rmax = 0;
        int res = 0;
        while (left < right) {
            if (height[left] > lmax) {
                lmax = height[left];
            }
            if (height[right] > rmax) {
                rmax = height[right];
            }
            res += lmax - height[left] + rmax - height[right];
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
