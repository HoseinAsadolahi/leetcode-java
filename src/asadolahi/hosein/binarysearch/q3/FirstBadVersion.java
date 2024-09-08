package asadolahi.hosein.binarysearch.q3;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int low = 1;
        int mid;
        while (low <= n) {
            mid = low + (n - low) / 2;
            if (isBadVersion(mid)) {
                n = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    boolean isBadVersion(int version) {
        return version >= 1;
    }
}
