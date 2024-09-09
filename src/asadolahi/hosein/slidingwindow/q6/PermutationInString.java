package asadolahi.hosein.slidingwindow.q6;

import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        int n1 = s1.length();
        int n2 = s2.length();
        for (int i = 0; i < n1; i++) {
            count1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n1; i++) {
            count2[s2.charAt(i) - 'a']++;
        }
        for (int i = n1; i < n2; i++) {
            if (Arrays.equals(count1, count2)) {
                return true;
            }
            count2[s2.charAt(i) - 'a']++;
            count2[s2.charAt(i - n1) - 'a']--;
        }
        return Arrays.equals(count1, count2);
    }
}
