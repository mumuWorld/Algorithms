package Tree.最近公共祖先;

import DataStructure.TreeNode;

public class ZuiJinGongGongZuXian {
    /**
     * https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/
     * 二叉树问题基本可以通过递归遍历解决 或者 层次遍历。
     *
     * 去以root为根节点的二叉树中查找p、q的最近公共祖先。
     * 1、如果p、q都在二叉树中，肯定能找到。
     * 2、如果都不在，返回null。
     * 3、如果p存在二叉树中，返回p。
     * 4、如果q存在二叉树中、返回q。
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) return root;
        TreeNode leftP = lowestCommonAncestor(root.left, p, q);
        TreeNode rightP = lowestCommonAncestor(root.right, p, q);
        if (leftP != null && rightP != null) return root;
        return leftP == null ? rightP : leftP;
    }
}
