package String.最长公共子序列;

public class ZuiChangGongGongZiXuLie {
    /**
     * https://leetcode-cn.com/problems/longest-common-subsequence/
     * 最长公共子序列
     * 动态规划 ： 状态转移方程
     * dp[i][j] 为 前 i 个元素和 前j 个元素的公共子序列
     */
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() < 1 || text2.length() < 1) return 0;
        char[] chars = text1.toCharArray();
        char[] chars2 = text2.toCharArray();
        int[][] dp = new int[chars.length + 1][chars2.length + 1];
        for (int i = 0; i < chars.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < chars2.length; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= chars.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                if (chars[i - 1] == chars2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[chars.length][chars2.length];
    }

    /**
     * 优化  一位数组
     * @param text1
     * @param text2
     * @return
     */
    public int longestCommonSubsequence_2(String text1, String text2) {
        if (text1.length() < 1 || text2.length() < 1) return 0;
        char[] chars = text1.toCharArray();
        char[] chars2 = text2.toCharArray();
        int[] dp = new int[chars2.length + 1];
        for (int i = 1; i <= chars.length; i++) {
            int cur = 0;
            for (int j = 1; j <= chars2.length; j++) {
                int leftTop = cur; //上一个topleft
                cur = dp[j];  //保存本次的 topleft。
                if (chars[i -1] == chars2[j - 1]) {
                    dp[j] = leftTop + 1;
                } else {
                    dp[j] = Math.max(dp[j-1], dp[j]);
                }
            }
        }
        return dp[chars2.length];
    }
//    public int longestCommonSubsequence(int[] text1, int[] text2) {
//
//    }
}
