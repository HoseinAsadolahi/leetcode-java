package asadolahi.hosein.arrays.q11;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int wall = 0, temp = 0, temp1 = 0;
        for (wall = 0; wall < matrix.length / 2; wall++) {
            for (int i = 0; i < matrix.length - 2 * wall - 1; i++) {
                temp = matrix[wall + i][matrix.length - wall - 1];
                matrix[wall + i][matrix.length - wall - 1] = matrix[wall][wall + i];
                temp1 = matrix[matrix.length - wall - 1][matrix.length - wall - i - 1];
                matrix[matrix.length - wall - 1][matrix.length - wall - i - 1] = temp;
                temp = matrix[matrix.length - wall - i - 1][wall];
                matrix[matrix.length - wall - i - 1][wall] = temp1;
                matrix[wall][wall + i] = temp;
            }
        }
    }
}
