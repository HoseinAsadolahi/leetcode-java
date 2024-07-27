package asadolahi.hosein.hashmap.validanagram;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] map = new int[26];
        for (char c : t.toCharArray()) {
            map[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            if (map[c - 'a']-- == 0) {
                return false;
            }
        }
        return true;
    }
}
