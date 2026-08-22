// Problem   : 349. Intersection of Two Arrays
// Difficulty: Easy
// Link      : https://leetcode.com/problems/intersection-of-two-arrays/
// Runtime   : 3 ms (beats 46.5%)
// Memory    : 45.2 MB (beats 24.9%)
// Submitted : 2026-08-22 15:42
// Tags      : Array, Hash Table, Two Pointers, Binary Search, Sorting
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        
        for( int num : nums1){
            s1.add(num);
        }
        for( int num: nums2){
            s2.add(num);
        }
        
        int[] res = new int[s1.size()];
        
        int k = 0;
        for(int num: s1){
            if (s2.contains(num)){
                res[k] = num;
                k+=1;
            }
        }
        
        return Arrays.copyOfRange(res, 0, k);
    }
}