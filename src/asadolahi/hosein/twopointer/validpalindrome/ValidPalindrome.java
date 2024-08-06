package asadolahi.hosein.twopointer.validpalindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] chars = new char[s.length()];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = s.charAt(i);
            if (!Character.isAlphabetic(c) && !Character.isDigit(c)) {
                continue;
            }
            chars[index++] = Character.toLowerCase(c);
        }
        int i = 0, j = index - 1;
        while (i < j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
