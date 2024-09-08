package asadolahi.hosein.binarysearch.q7;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid;
        int lowest = low;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] < nums[lowest]) {
                high = mid - 1;
                lowest = mid;
            } else {
                low = mid + 1;
            }
        }
        int bs = bs(nums, target, 0, lowest - 1);
        if (bs == -1) {
            return bs(nums, target, lowest, nums.length - 1);
        }
        return bs;
    }
    public int bs(int[] nums, int target, int low, int high) {
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
