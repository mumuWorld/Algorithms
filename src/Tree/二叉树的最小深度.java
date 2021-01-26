package Tree;

import DataStructure.TreeNode;

public class 二叉树的最小深度 {
    /**
     * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
     *
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int dep = Integer.MAX_VALUE;
        if (root.left != null) {
            dep = Math.min(dep, minDepth(root.left));
        }
        if (root.right != null) {
            dep = Math.min(dep, minDepth(root.right));
        }
        return dep + 1;
    }

    /**
     * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
     * 最大深度
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        int max = Integer.MIN_VALUE;
        if (root.left != null) {
            max = Math.max(max, maxDepth(root.left));
        }
        if (root.right != null) {
            max = Math.max(max, maxDepth(root.right));
        }
        return max + 1;
    }

    /**
     * 最远距离
     *
     * @param root
     * @return
     */
    public int maxHeight(TreeNode root) {
        maxHeight_tool(root);
        return maxHeight;
    }
    int maxHeight = Integer.MIN_VALUE;
    public int maxHeight_tool(TreeNode root) {
        if (root == null) return 0;
        int left = maxHeight(root.left);
        int right = maxHeight(root.right);
        maxHeight = Math.max(maxHeight, left + right + 1);
        //返回的是左右子树中的最高值
        return Math.max(left, right);
    }
}
