from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if prices is None or len(prices) == 0: return 0;

        max_profit = 0;
        buy_price = prices[0];
        for i in range(1, len(prices)):
            if max_profit < prices[i] - buy_price:
                max_profit = prices[i] - buy_price;
            if prices[i] < buy_price:
                buy_price = prices[i];

        return max_profit;



if __name__ == '__main__':
    sol = Solution();
    profit = sol.maxProfit([7, 1, 5, 3, 6, 4]);
    print(profit);