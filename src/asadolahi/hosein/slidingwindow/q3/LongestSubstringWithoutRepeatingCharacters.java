package asadolahi.hosein.slidingwindow.q3;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        boolean[] exist = new boolean[128];
        int max = 0, start = 0, end = 0;
        while (end < s.length()) {
            if (!exist[s.charAt(end)]) {
                exist[s.charAt(end)] = true;
                end++;
                max = Math.max(max, end - start);
            } else {
                exist[s.charAt(start)] = false;
                start++;
            }
        }
        return max;
    }
}
