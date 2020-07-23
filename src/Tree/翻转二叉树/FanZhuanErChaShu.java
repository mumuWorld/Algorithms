package Tree.翻转二叉树;

import DataStructure.TreeNode;

public class FanZhuanErChaShu {
    /**
     * https://leetcode-cn.com/problems/invert-binary-tree/
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = tmp;
        return root;
    }
}
