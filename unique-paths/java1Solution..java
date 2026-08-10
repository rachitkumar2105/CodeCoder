import java.math.BigInteger;

class Solution {
    public BigInteger uniquePaths(int m, int n) {
        BigInteger[] dp = new BigInteger[n];

        for (int j = 0; j < n; j++) {
            dp[j] = BigInteger.ONE;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j].add(dp[j - 1]);
            }
        }

        return dp[n - 1];
    }
}