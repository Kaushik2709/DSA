// Problem   : 11. Container With Most Water
// Difficulty: Medium
// Link      : https://leetcode.com/problems/container-with-most-water/
// Runtime   : 0 ms (beats 100.0%)
// Memory    : 63 MB (beats 11.4%)
// Submitted : 2026-08-11 07:24
// Tags      : Array, Two Pointers, Greedy
class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0, right = (int)height.size() - 1;
        int maxWater = 0;

        while (left < right) {
            int h = min(height[left], height[right]);
            int w = right - left;
            maxWater = max(maxWater, h * w);

            // Move the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
};