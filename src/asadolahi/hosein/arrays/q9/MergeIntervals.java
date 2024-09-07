package asadolahi.hosein.arrays.q9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> out = new ArrayList<>();
        int[] curr = intervals[0];
        for (int[] interval: intervals) {
            if (interval[0] > curr[1]) {
                out.add(curr);
                curr = interval;
            } else {
                curr[1] = Math.max(interval[1], curr[1]);
            }
        }
        out.add(curr);
        return out.toArray(new int[out.size()][]);
    }
}
