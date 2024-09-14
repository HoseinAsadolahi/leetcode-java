package asadolahi.hosein.recursivebacktracking.q6;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(), n, n);
        return res;
    }

    public void backtrack(List<String> parenthesis, StringBuilder temp, int open, int close) {
        if (close == 0) {
            parenthesis.add(temp.toString());
            return;
        }
        System.out.println(temp.toString());
        if (open > 0) {
            temp.append('(');
            backtrack(parenthesis, temp, open - 1, close);
            temp.setLength(temp.length() - 1);
        }
        if (close > open) {
            temp.append(')');
            backtrack(parenthesis, temp, open, close - 1);
            temp.setLength(temp.length() - 1);
        }
    }
}
