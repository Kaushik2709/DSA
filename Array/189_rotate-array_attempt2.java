// Problem   : 189. Rotate Array
// Difficulty: Medium
// Link      : https://leetcode.com/problems/rotate-array/
// Runtime   : 4 ms (beats 10.1%)
// Memory    : 268.4 MB (beats 5.3%)
// Submitted : 2026-08-22 10:30
// Tags      : Array, Math, Two Pointers
class Solution {
    public void rev(int[] nums, int start, int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        // Reverse the entier array
        rev(nums,0,n-1);
        // reverse the 1st K
        rev(nums, 0, k-1);
        // reverse the remaining elements
        rev(nums, k, n-1);
    }
}