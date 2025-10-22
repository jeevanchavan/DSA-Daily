// Given a string s, find the length of the longest substring without 
// duplicate characters.

// Brute Force Approach -> O(n^3)

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcdb";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }

    static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        // Step 1: generate all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // Step 2: check uniqueness of substring s[i...j]
                if (isUnique(s, i, j)) {
                    // update max length if unique
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    // Helper method to check uniqueness of substring s[i...j]
    static boolean isUnique(String s, int start, int end) {
        boolean[] seen = new boolean[256]; // assume extended ASCII

        for (int k = start; k <= end; k++) {
            char c = s.charAt(k);
            if (seen[c]) {
                return false; // duplicate found
            }
            seen[c] = true;
        }
        return true;
    }
}