package com.mamta.leetcode.twopointer;

import org.junit.jupiter.api.Test;

public class Leet121 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int buyPrice = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length;i++) {

            if(profit < prices[i]-buyPrice ) {
                profit = prices[i]-buyPrice;
            }
            if(prices[i] < buyPrice ) {
                buyPrice = prices[i];
            }


        }
        return profit;

    }

    @Test
    public void solution() {
        int[] prices = {7,1,5,3,6,4};

      System.out.println(maxProfit(prices));

    }
}
