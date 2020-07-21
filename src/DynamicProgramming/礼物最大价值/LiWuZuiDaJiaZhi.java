package DynamicProgramming.礼物最大价值;

public class LiWuZuiDaJiaZhi {
    /**
     * https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
     * 动态规划
     * dp[row][col] 为当前位置的最大价值 为 max(dp[row-1][col], dp[row][col -1]) + grid[row][col]
     * 1 先对 第0行 第0列 特殊处理
     */
    public int maxValue(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        //对左上角 特殊处理。
        dp[0][0] = grid[0][0];

        //第0行
        for (int i = 1; i < cols; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        //第0列
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        //其他
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
            }
        }
        //返回右下角最大值
        return dp[rows - 1][cols - 1];
    }

    //变种题  最小路径和

    /**
     * https://leetcode-cn.com/problems/minimum-path-sum/
     */
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        dp[0][0] = grid[0][0];
        for (int col = 1; col < cols; col++) {
            dp[0][col] = dp[0][col - 1] + grid[0][col];
        }
        for (int row = 1; row < rows; row++) {
            dp[row][0] = dp[row - 1][0] + grid[row][0];
        }
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                dp[row][col] = Math.min(dp[row - 1][col], dp[row][col - 1]) + grid[row][col];
            }
        }
        return dp[rows - 1][cols - 1];
    }

    //变种题 2 不同路径

    /**
     * https://leetcode-cn.com/problems/unique-paths/
     *
     * @return
     */
    public int uniquePaths(int m, int n) {
        int count = 0;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = (j > 0 && i > 0) ? dp[i - 1][j] + dp[i][j - 1] : 1;
            }
        }
        return dp[m - 1][n - 1];
    }

//优化
//    class Solution {
//        public:
//
//        int uniquePaths(int m, int n) {
//            vector<int> dp (n, 0);
//            for (int i = 0; i < m; ++i) {
//                for (int j = 0; j < n; ++j) {
//                    dp[j] = (i > 0 && j > 0) ? dp[j] = dp[j - 1] + dp[j] : 1;
//                }
//            }
//            return dp[n - 1];
//        }
//    }

}

