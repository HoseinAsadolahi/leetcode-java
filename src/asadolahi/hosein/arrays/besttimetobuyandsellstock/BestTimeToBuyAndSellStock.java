package asadolahi.hosein.arrays.besttimetobuyandsellstock;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int low = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < low) {
                low = prices[i];
            } else {
                profit = Math.max(prices[i] - low, profit);
            }
        }
        return profit;
    }
}