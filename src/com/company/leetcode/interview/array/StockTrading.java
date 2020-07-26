package com.company.leetcode.interview.array;

public class StockTrading {


    public int maxProfit(int[] prices) {


        int tempHigher =prices[0];
        int buyPrice = prices[0];
        int profit = 0;
        boolean isOpen = false;
        for (int i = 1; i < prices.length; i++) {
            if (tempHigher < prices[i]) {
                tempHigher = prices[i];
            } else {
                profit += tempHigher - buyPrice;
                buyPrice = prices[i];
                tempHigher = prices[i];
            }

        }

        return profit;
    }

    public static void main(String[] args) {
        int a = ' ';
        System.out.println((double)5/2);
        new StockTrading().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }
}
