package org.ski.leetcode.dailychallenges;

public class Daily_29_07_2024_1395 {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            int leftSmaller = 0;
            int leftLarger = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) leftSmaller++;
                else leftLarger++;
            }

            int rightSmaller = 0;
            int rightLarger = 0;
            for (int j = i + 1; j < n; j++) {
                if (rating[j] > rating[i]) rightLarger++;
                else rightSmaller++;
            }

            ans += (leftSmaller * rightLarger) + (rightSmaller * leftLarger);
        }

        return ans;
    }
}
