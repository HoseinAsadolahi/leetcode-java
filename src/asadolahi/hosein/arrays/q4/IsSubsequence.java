package asadolahi.hosein.arrays.q4;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int index = 0;
        for (char x : t.toCharArray()) {
            if (s.charAt(index) == x) {
                index++;
            }
            if (index == s.length()) {
                return true;
            }
        }
        return false;
    }
}
