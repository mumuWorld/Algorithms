package DynamicProgramming.买卖股票的最佳时机;

public class BestTimeToBuyAndSellStock {
    /**
     * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        //前面扫过的最小价格
        int minPrice = prices[0];
        //前面扫过的最大利润
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else { //把第i天的股票卖出
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    //动态规划解法

    /**
     * 第i天買，第j天買的利潤 是 第 i ~j內，所有相邻两天股价差的和。
     * 最大子数组的和。 也就是最大连续子序列。
     * @param prices
     * @return
     */
//    public int maxProfit_2(int[] prices) {
//
//    }
}
