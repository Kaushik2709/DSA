// Problem   : 10. Regular Expression Matching
// Difficulty: Hard
// Link      : https://leetcode.com/problems/regular-expression-matching/
// Runtime   : 0 ms (beats 100.0%)
// Memory    : 9.3 MB (beats 32.8%)
// Submitted : 2026-05-29 13:57
// Tags      : String, Dynamic Programming, Recursion
class Solution {
public:
    bool isMatch(string s, string p) {
        int m = s.size();
        int n = p.size();

        vector<vector<bool>> dp(m + 1, vector<bool>(n + 1, false));

        dp[0][0] = true;

        // Handle patterns like a*, a*b*, a*b*c*
        for (int j = 2; j <= n; j++) {
            if (p[j - 1] == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                // Direct match or '.'
                if (p[j - 1] == s[i - 1] || p[j - 1] == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                }

                // Handle '*'
                else if (p[j - 1] == '*') {

                    // Zero occurrence of previous char
                    dp[i][j] = dp[i][j - 2];

                    // One or more occurrences
                    if (p[j - 2] == s[i - 1] || p[j - 2] == '.') {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }

        return dp[m][n];
    }
};