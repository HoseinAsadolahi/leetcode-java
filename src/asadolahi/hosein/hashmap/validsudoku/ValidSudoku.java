package asadolahi.hosein.hashmap.validsudoku;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        boolean[] set1 = new boolean[10];
        boolean[] set2 = new boolean[10];
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (set1[board[i][j] - '0']) {
                        return false;
                    } else {
                        set1[board[i][j] - '0'] = true;
                    }
                }
                if (board[j][i] != '.') {
                    if (set2[board[j][i] - '0']) {
                        return false;
                    } else {
                        set2[board[j][i] - '0'] = true;
                    }
                }
            }
            Arrays.fill(set1, false);
            Arrays.fill(set2, false);
        }
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                for (int k = i * 3; k < i * 3 + 3; k++) {
                    for (int l = j * 3; l < j * 3 + 3; l++) {
                        if (board[k][l] != '.') {
                            if (set1[board[k][l] - '0']) {
                                return false;
                            } else {
                                set1[board[k][l] - '0'] = true;
                            }
                        }
                    }
                }
                Arrays.fill(set1, false);
            }
        }
        return true;
    }
}


//    public boolean isValidSudoku(char[][] board) {
//        Set<Character> set1 = new HashSet<>();
//        Set<Character> set2 = new HashSet<>();
//        for (int i = 0; i < 9; i ++) {
//            for (int j = 0; j < 9; j++) {
//                if (board[i][j] != '.') {
//                    if (!set1.add(board[i][j])) {
//                        return false;
//                    }
//                }
//                if (board[j][i] != '.') {
//                    if (!set2.add(board[j][i])) {
//                        return false;
//                    }
//                }
//            }
//            set1.clear();
//            set2.clear();
//        }
//        for (int i = 0; i < 3; i ++) {
//            for (int j = 0; j < 3; j++) {
//                for (int k = i * 3; k < i * 3 + 3; k++) {
//                    for (int l = j * 3; l < j * 3 + 3; l++) {
//                        if (board[k][l] != '.') {
//                            if (!set1.add(board[k][l])) {
//                                return false;
//                            }
//                        }
//                    }
//                }
//                set1.clear();
//            }
//        }
//        return true;
//    }
