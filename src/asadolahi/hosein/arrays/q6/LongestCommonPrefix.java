package asadolahi.hosein.arrays.q6;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < min) {
                min = str.length();
            }
        }
        int i;
        for (i = 0; i < min; i++) {
            char curr = strs[0].charAt(i);
            for (String str : strs) {
                if (curr != str.charAt(i)) {
                    return str.substring(0, i);
                }
            }
        }
        return strs[0].substring(0, i);
    }
}
