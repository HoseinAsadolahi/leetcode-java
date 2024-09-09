package asadolahi.hosein.slidingwindow.q4;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int end = 0, start = 0;
        int[] count = new int[26];
        int major = 0, n = s.length();
        while (end < n) {
            int curr = ++count[s.charAt(end) - 'A'];
            if (curr > major) {
                major = curr;
            }
            end++;
            if (end - start - major > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }
        }
        return end - start;
    }
}
