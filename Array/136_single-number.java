// Problem   : 136. Single Number
// Difficulty: Easy
// Link      : https://leetcode.com/problems/single-number/
// Runtime   : 11 ms (beats 24.1%)
// Memory    : 47.2 MB (beats 13.8%)
// Submitted : 2026-08-22 11:12
// Tags      : Array, Bit Manipulation
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for( int i=0; i<nums.length; i++){
            result = result ^ nums[i];
        }
        return result;
    }
}