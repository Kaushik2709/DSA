// Problem   : 1295. Find Numbers with Even Number of Digits
// Difficulty: Easy
// Link      : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Runtime   : 1 ms (beats 99.5%)
// Memory    : 44.2 MB (beats 95.5%)
// Submitted : 2026-08-28 18:50
// Tags      : Array, Math
class Solution {

    public boolean numberHasEvenDigits(int num){
        int digitCount = 0;
        while (num !=0){
            num = num/10;
            digitCount++;
        }
        return digitCount %2 == 0;
    }

    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int i=0; i< nums.length ; i++){
            if(numberHasEvenDigits(nums[i])){
                evenCount++;
            }
        }
        return evenCount;
    }
}