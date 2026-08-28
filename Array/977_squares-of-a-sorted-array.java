// Problem   : 977. Squares of a Sorted Array
// Difficulty: Easy
// Link      : https://leetcode.com/problems/squares-of-a-sorted-array/
// Runtime   : 1 ms (beats 100.0%)
// Memory    : 47.1 MB (beats 87.2%)
// Submitted : 2026-08-28 19:25
// Tags      : Array, Two Pointers, Sorting
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for (int i =0; i<nums.length; i++){
//             nums[i] = nums[i] * nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }


class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }
        }

        return result;
    }
}