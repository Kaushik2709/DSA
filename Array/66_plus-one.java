// Problem   : 66. Plus One
// Difficulty: Easy
// Link      : https://leetcode.com/problems/plus-one/
// Runtime   : 0 ms (beats 100.0%)
// Memory    : 43.5 MB (beats 43.1%)
// Submitted : 2026-08-28 04:09
// Tags      : Array, Math
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1; i>=0; i=i-1){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}