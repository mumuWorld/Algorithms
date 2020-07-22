package Tree.二叉树镜像;

import DataStructure.TreeNode;

public class TreeJingXiang {
    /**
     * https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.right;
        root.right = mirrorTree(root.left);
        root.left = mirrorTree(tmp);
        return root;
    }
}
