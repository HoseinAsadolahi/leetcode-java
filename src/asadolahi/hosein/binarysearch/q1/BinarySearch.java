package asadolahi.hosein.binarysearch.q1;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
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
