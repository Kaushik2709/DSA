// Problem   : 14. Longest Common Prefix
// Difficulty: Easy
// Link      : https://leetcode.com/problems/longest-common-prefix/
// Runtime   : 0 ms (beats 100.0%)
// Memory    : 11.9 MB (beats 60.3%)
// Submitted : 2026-05-29 08:15
// Tags      : Array, String, Trie
class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (strs.empty()) return "";

        string prefix = strs[0];

        for (int i = 1; i < strs.size(); i++) {
            while (strs[i].find(prefix) != 0) {
                prefix.pop_back();

                if (prefix.empty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
};