package asadolahi.hosein.hashmap.q10;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int count, max = 0, temp;
        for (int num : nums) {
            count = 1;
            temp = num;
            if (!set.contains(temp + 1)) {
                while (set.contains(temp - 1)) {
                    temp--;
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{4, 3, 1, 0, 10, 1, 9, 0, 2}));
    }
}