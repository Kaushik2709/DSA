// Problem   : 485. Max Consecutive Ones
// Difficulty: Easy
// Link      : https://leetcode.com/problems/max-consecutive-ones/
// Runtime   : 2 ms (beats 98.3%)
// Memory    : 52.4 MB (beats 66.5%)
// Submitted : 2026-08-28 07:23
// Tags      : Array
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i=0 ; i < nums.length; i++){
            if(nums[i]==1){
                count +=1;
            }else{
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max,count);
    }
}