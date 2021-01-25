package Tree.二叉搜索树的范围和;

import DataStructure.TreeNode;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/range-sum-of-bst/
     * 二叉搜索树的范围和
     * @param low
     * @param high
     * @return
     */
    public int rangeSumBST(TreeNode root, int low, int high) {
        sortTree(root,low,high);
        return sum;
    }

    int sum  = 0;

    public void sortTree(TreeNode root, int low, int high) {
        if(root == null) return;
        if(root.val >= low && root.val <= high) {
            sum += root.val;
        }
        sortTree(root.left, low, high);
        sortTree(root.right, low, high);
    }
}
