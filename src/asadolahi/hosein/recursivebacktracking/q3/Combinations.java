package asadolahi.hosein.recursivebacktracking.q3;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    int n;
    int k;
    List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        this.n = n;
        this.k = k;
        backtrack(new ArrayList<>(), -1);
        return res;
    }

    private void backtrack(List<Integer> temp, int last) {
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = last + 1; i < n; i++) {
            temp.add(i + 1);
            backtrack(temp, i);
            temp.removeLast();
        }
    }
}
