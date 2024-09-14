package asadolahi.hosein.recursivebacktracking.q4;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, res, new ArrayList<>(), 0, target, n, 0);
        return res;
    }

    private void backtrack(int[] nums,List<List<Integer>> res, List<Integer> temp,int sum, int target, int n, int last) {
        if (sum == target) {
            res.add(new ArrayList<>(temp));
            return;
        } else if (sum > target) {
            return;
        }
        for (int i = last; i < n; i++) {
            int num = nums[i];
            temp.add(num);
            backtrack(nums,res, temp, sum + num, target, n, i);
            temp.removeLast();
        }
    }
}
