package asadolahi.hosein.binarysearch.q8;

import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 1_000_000_000, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (eat(piles, mid) > h) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    public double eat(int[] piles, int k) {
        double count = 0;
        for (int pile : piles) {
            count += Math.ceil((double) pile / k);
        }
        return count;
    }
}
