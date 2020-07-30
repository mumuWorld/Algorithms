package DynamicProgramming.整数拆分;

public class ZhengShuChaiFen {
    /** https://leetcode-cn.com/problems/integer-break/comments/
     *dp[i] = {max(j×(i−j),j×dp[i−j])}
     */
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        //dp[i] 为 在i处的最大值
        dp[0] = 0;
        //1 不能拆分所以 也为0
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i -j),  j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }

    //相似题目
    //剪绳子

    /** https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
     *
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        return 0;
    }
}
