package asadolahi.hosein.recursivebacktracking.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(nums, res, new ArrayList<>(), 0, visited);
        return res;
    }

    private void backtrack(int[] nums, List<List<Integer>> res, List<Integer> temp, int idx, boolean[] visited) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.add(nums[i]);
                backtrack(nums, res, temp, idx + 1, visited);
                temp.removeLast();
                visited[i] = false;
            }
        }
    }
}
