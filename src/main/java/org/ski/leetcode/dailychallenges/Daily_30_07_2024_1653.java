package org.ski.leetcode.dailychallenges;

public class Daily_30_07_2024_1653 {
    public int minimumDeletions(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        int bCount = 0;


        for (int i = 1; i <= n; i++) {
            if (s.charAt(i-1) == 'b') {
                dp[i] = dp[i-1];
                bCount++;
            } else {
                dp[i] = Math.min(dp[i-1] + 1, bCount);
            }
        }

        return dp[n];
    }
}
