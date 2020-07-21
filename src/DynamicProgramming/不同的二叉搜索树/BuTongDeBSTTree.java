package DynamicProgramming.不同的二叉搜索树;

public class BuTongDeBSTTree {
    /**
     * https://leetcode-cn.com/problems/unique-binary-search-trees/comments/
     * dp[i] 为以i为跟节点的子树个数。
     * dp[i] = f[1] + f[2] + f[3] + ... + f[i]
     * f[i] = dp[i-1] * dp[j-i]
     *
     */
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
