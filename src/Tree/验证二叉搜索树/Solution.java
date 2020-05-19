package Tree.验证二叉搜索树;

import DataStructure.TreeNode;

public class Solution {
    private int lastValue = Integer.MIN_VALUE;
    /**
     * https://leetcode-cn.com/problems/validate-binary-search-tree/
     * 验证条件
     * 1 中序遍历 是升序
     */
    boolean solution_1(TreeNode treeNode) {
        if (treeNode == null) return true;
        boolean left = solution_1(treeNode.left);
        if (!left) {
            return left;
        }
        if (treeNode.val <= lastValue) {
            return false;
        }
        lastValue = treeNode.val;
        boolean right = solution_1(treeNode.right);
        return right;
    }
}
