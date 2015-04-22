Best Time to Buy and Sell Stock

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution:

    # @param {integer[]} prices

    # @return {integer}

    def maxProfit(self, prices):

        if len(prices) == 0:

            return 0

        current = 0

        total = 0

        for i in range(len(prices)-1):

            current = max(current + (prices[i+1] - prices[i]), 0)

            total = max(current, total)

        return total

        
Wed Apr 22 12:25:57 CST 2015
