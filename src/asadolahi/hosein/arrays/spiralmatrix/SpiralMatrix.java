package asadolahi.hosein.arrays.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> out = new ArrayList<>();
        int state = 0;
        int left = 0, right = matrix[0].length - 1, up = 0, down = matrix.length - 1, i = 0, j = 0;
        while (true) {
            if (out.size() == matrix.length * matrix[0].length) {
                return out;
            }
            if (state == 0) {
                if (j == right) {
                    state = 1;
                    up++;
                    continue;
                }
                out.add(matrix[i][j]);
                j++;
            } else if (state == 1) {
                if (i == down) {
                    state = 2;
                    right--;
                    continue;
                }
                out.add(matrix[i][j]);
                i++;
            } else if (state == 2) {
                if (j == left) {
                    state = 3;
                    down--;
                    continue;
                }
                out.add(matrix[i][j]);
                j--;
            } else {
                if (i == up) {
                    state = 0;
                    left++;
                    continue;
                }
                out.add(matrix[i][j]);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] x = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(x));
    }
}
