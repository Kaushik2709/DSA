// Problem   : 26. Remove Duplicates from Sorted Array
// Difficulty: Easy
// Link      : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Runtime   : 0 ms (beats 100.0%)
// Memory    : 22.7 MB (beats 53.1%)
// Submitted : 2026-08-22 06:20
// Tags      : Array, Two Pointers
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int k = 1;

        for (int j = 1; j < nums.size(); j++) {
            if (nums[j] != nums[j - 1]) {
                nums[k] = nums[j];
                k++;
            }
        }

        return k;
    }
};