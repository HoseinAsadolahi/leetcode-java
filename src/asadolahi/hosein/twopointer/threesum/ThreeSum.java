package asadolahi.hosein.twopointer.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if(nums[i] > 0) {
                break;
            }
            int k = i + 1;
            int j = nums.length - 1;
            while (k < j) {
                int sum = nums[i] + nums[k] + nums[j];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[k], nums[j]));
                    do {
                        k++;
                    } while (k > i + 1 && k < j && nums[k] == nums[k - 1]);
                } else if (sum > 0) {
                    j--;
                } else {
                    k++;
                }
            }
        }
        return res;
    }
}
