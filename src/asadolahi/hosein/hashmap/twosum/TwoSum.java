package asadolahi.hosein.hashmap.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer x = map.get(target - nums[i]);
            if (x != null) {
                return new int[]{i, x};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
