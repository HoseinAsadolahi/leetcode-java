package asadolahi.hosein.recursivebacktracking.q7;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (chars[0] == board[i][j]) {
                    if (backtrack(board, chars, i, j, board.length, board[0].length, 0))
                        return true;
                }
            }
        }
        return false;
    }

    public boolean backtrack(char[][] board, char[] word, int i, int j, int m, int n, int index) {
        if (index == word.length) {
            return true;
        }
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != word[index]) {
            return false;
        }
        board[i][j] ^= 256;
        boolean found = backtrack(board, word, i + 1, j, m, n, index + 1) ||
                backtrack(board, word, i - 1, j, m, n, index + 1) ||
                backtrack(board, word, i, j - 1, m, n, index + 1) ||
                backtrack(board, word, i, j + 1, m, n, index + 1);
        if (found) {
            return true;
        }
        board[i][j] ^= 256;
        return false;
    }
}
