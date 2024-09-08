package asadolahi.hosein.binarysearch.q6;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        int mid;
        int lowest = nums[low];
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] < lowest) {
                high = mid - 1;
                lowest = nums[mid];
            } else {
                low = mid + 1;
            }
        }
        return lowest;
    }
}
