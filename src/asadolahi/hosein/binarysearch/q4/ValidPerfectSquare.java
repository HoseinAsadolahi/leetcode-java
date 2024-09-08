package asadolahi.hosein.binarysearch.q4;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long low = 1, high = num;
        long mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
