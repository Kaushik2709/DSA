// Problem   : 122. Best Time to Buy and Sell Stock II
// Difficulty: Medium
// Link      : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Runtime   : 0 ms (beats 100.0%)
// Memory    : 46.6 MB (beats 18.2%)
// Submitted : 2026-08-22 08:08
// Tags      : Array, Dynamic Programming, Greedy
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for( int i = 1 ; i< prices.length; i++){
            if(prices[i]>prices[i-1]){
                maxProfit = maxProfit + prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}