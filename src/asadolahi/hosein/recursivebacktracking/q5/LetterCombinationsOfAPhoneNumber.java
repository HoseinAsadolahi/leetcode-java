package asadolahi.hosein.recursivebacktracking.q5;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    String[][] chars = {{"a","b", "c"}, { "d", "e", "f" }, { "g", "h", "i" },
            { "j", "k", "l" }, { "m", "n", "o" }, { "p", "q", "r", "s" },
            {"t", "u", "v"}, {"w", "x", "y", "z" } };
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) return res;
        backtrack(res, digits, new StringBuilder(), 0);
        return res;
    }

    private void backtrack(List<String> list, String digits, StringBuilder temp, int step) {
        if (step == digits.length()) {
            list.add(temp.toString());
            return;
        }
        int digit = Integer.parseInt(digits.charAt(step) + "") - 2;
        int n = chars[digit].length;
        for (int i = 0; i < n; i++) {
            temp.append(chars[digit][i]);
            backtrack(list, digits, temp, step + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
