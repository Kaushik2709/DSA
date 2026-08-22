// Problem   : 217. Contains Duplicate
// Difficulty: Easy
// Link      : https://leetcode.com/problems/contains-duplicate/
// Runtime   : 25 ms (beats 18.1%)
// Memory    : 81.3 MB (beats 95.3%)
// Submitted : 2026-08-22 10:42
// Tags      : Array, Hash Table, Sorting
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for( int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}