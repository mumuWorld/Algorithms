package DFS.路径总和;

import DataStructure.TreeNode;

public class LuJingZongHe {
    /**
     * https://leetcode-cn.com/problems/path-sum/
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        boolean result = dfs(root, sum);
        return result;
    }

    /**
     * 终止条件是叶子节点。
     * @param root
     */
    private boolean dfs(TreeNode root,int sum) {
        if (root == null) return false;
        //叶子节点
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        sum -= root.val;
        boolean result_1 = dfs(root.left, sum);
        boolean result_2 = dfs(root.right,sum);
        return result_1 || result_2;
    }
}
