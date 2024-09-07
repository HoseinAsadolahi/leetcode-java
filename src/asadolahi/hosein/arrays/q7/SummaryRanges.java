package asadolahi.hosein.arrays.q7;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        ArrayList<String> out = new ArrayList<>();
        int begin = 0, prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev + 1) {
                if (nums[begin] == nums[i - 1]) {
                    out.add(nums[begin] + "");
                } else {
                    out.add(nums[begin] + "->" + nums[i - 1]);
                }
                begin = i;
            }
            prev = nums[i];
        }
        if (begin == nums.length - 1) {
            out.add((nums[begin] + ""));
        } else {
            out.add(nums[begin] + "->" + nums[nums.length - 1]);
        }
        return out;
    }
}
