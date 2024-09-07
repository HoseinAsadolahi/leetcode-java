package asadolahi.hosein.hashmap.q9;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int n2 = n / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > n2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
