package 动态规划.Que_1;

public class dp_1 {
    /**
     * https://leetcode-cn.com/problems/distinct-subsequences/
     * 115. 不同的子序列
     * @param s
     * @param t
     * @return
     */
    public int numDistinct(String s, String t) {
        int sl = s.length(), tl = t.length();

        int[][] dp = new int[tl + 1][sl + 1];
        for (int i = 0; i < sl; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < tl + 1; i++) {
            for (int j = 1; j < sl + 1; j++) {
                if (t.charAt(i-1) == s.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + dp[i][j-1];
                } else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[tl][sl];
    }
}
