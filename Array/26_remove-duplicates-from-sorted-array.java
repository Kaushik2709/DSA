// Problem   : 26. Remove Duplicates from Sorted Array
// Difficulty: Easy
// Link      : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Runtime   : 1 ms (beats 77.6%)
// Memory    : 46.7 MB (beats 63.8%)
// Submitted : 2026-08-22 06:19
// Tags      : Array, Two Pointers
class Solution {
    public int removeDuplicates(int[] nums) {
        int k =1;
        for (int j =1; j < nums.length; j++){
            if(nums[j] != nums[j-1]){
                nums[k] =nums[j];
                k = k+1;
            }
        }
        return k;
    }
}