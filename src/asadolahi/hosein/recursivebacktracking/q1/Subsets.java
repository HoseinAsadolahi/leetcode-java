package asadolahi.hosein.recursivebacktracking.q1;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> newSubset;
        res.add(new ArrayList<>());
        for (int num : nums) {
            int n = res.size();
            for (int i = 0; i < n; i++) {
                newSubset = new ArrayList<>(res.get(i));
                newSubset.add(num);
                res.add(newSubset);
            }
        }
        return res;
    }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        backtrack(nums, 0, sol, res);
        return res;
    }

    private void backtrack(int[] nums, int start, List<Integer> sol, List<List<Integer>> res) {
        res.add(new ArrayList<>(sol));
        for (int i = start; i < nums.length; i++) {
            sol.add(nums[i]);
            backtrack(nums, i + 1, sol, res);
            sol.remove(sol.size() - 1);
        }
    }
}
