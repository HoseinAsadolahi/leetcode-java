package asadolahi.hosein.binarysearch.q5;

public class SearchA2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = n * m - 1, mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            int num = matrix[mid / n][mid % n];
            if (num == target) {
                return true;
            } else if (num < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
