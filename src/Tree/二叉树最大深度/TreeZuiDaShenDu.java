package Tree.二叉树最大深度;

import DataStructure.TreeNode;

public class TreeZuiDaShenDu {
    /**
     * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
     * 无非就是 判断左边还是右边的子节点哪个深度高，然后 + 1
     */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
