// Problem   : 121. Best Time to Buy and Sell Stock
// Difficulty: Easy
// Link      : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Runtime   : 1 ms (beats 100.0%)
// Memory    : 94.2 MB (beats 86.0%)
// Submitted : 2026-08-22 06:33
// Tags      : Array, Dynamic Programming
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            if(price - minPrice > maxProfit){
                maxProfit = price-minPrice;
            }
        }
        return maxProfit;
    }
}