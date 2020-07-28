package Tree.简单树;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class JianDanShu {
    /** 相同树  判断两个二叉树是否相同
     *  https://leetcode-cn.com/problems/same-tree/
     *  要考虑 为空的情况。
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
    }

    /** 对称二叉树
     *  https://leetcode-cn.com/problems/symmetric-tree/
     * 给定一个二叉树，检查它是否是镜像对称的。
     * 递归检查
     */
    public boolean isSymmetric(TreeNode root) {
        return checkChild(root,root);
    }

    private boolean checkChild(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        //返回
        return left.val == right.val &&
                checkChild(left.left, right.right) &&
                checkChild(left.right, right.left);
    }
}
