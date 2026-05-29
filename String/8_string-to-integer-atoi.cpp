// Problem   : 8. String to Integer (atoi)
// Difficulty: Medium
// Link      : https://leetcode.com/problems/string-to-integer-atoi/
// Runtime   : 0 ms (beats 100.0%)
// Memory    : 9.1 MB (beats 53.8%)
// Submitted : 2026-05-29 13:33
// Tags      : String
class Solution {
public:
    int myAtoi(string s) {
        int i = 0, n = s.size();
        
        // Step 1: Skip leading whitespaces
        while (i < n && s[i] == ' ') {
            i++;
        }

        // Step 2: Check sign
        int sign = 1;
        if (i < n && (s[i] == '+' || s[i] == '-')) {
            if (s[i] == '-') {
                sign = -1;
            }
            i++;
        }

        // Step 3: Convert digits
        long result = 0;

        while (i < n && isdigit(s[i])) {
            int digit = s[i] - '0';

            // Step 4: Handle overflow
            if (result > (INT_MAX - digit) / 10) {
                return sign == 1 ? INT_MAX : INT_MIN;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
};