package DynamicProgramming.编辑距离;

public class BianJiJuLi {
    /**
     * https://leetcode-cn.com/problems/edit-distance/
     * 动态转换方程。
     */
    public int minDistance(String word1, String word2) {
        if (word1 == null || word2 == null) return 0;
        char[] cs1 = word1.toCharArray();
        char[] cs2 = word2.toCharArray();
        int[][] dp = new int[cs1.length + 1][ cs2.length + 1];
        dp[0][0] = 0;
        //第0列
        for (int i = 1; i <= cs1.length; i++) {
            dp[i][0] = i;
        }
        //第0行
        for (int i = 1; i <= cs2.length; i++) {
            dp[0][i] = i;
        }
        //其他行列
        for (int i = 1; i <= cs1.length; i++) {
            for (int j = 1; j <= cs2.length; j++) {
                //上边
                int top = dp[i - 1][j] + 1;
                //左边
                int left = dp[i][j - 1] + 1;
                //左上角
                int topLeft = dp[i - 1][j -1];
                if (cs1[i - 1] != cs2[j - 1]) {
                    topLeft++;
                }
                dp[i][j] = Math.min(Math.min(top, left), topLeft);
            }
        }
        return dp[cs1.length][cs2.length];
    }
    //优化 为1维数组。
}
