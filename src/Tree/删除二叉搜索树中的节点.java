package Tree;

import DataStructure.TreeNode;

public class 删除二叉搜索树中的节点 {
    /**
     * https://leetcode-cn.com/problems/delete-node-in-a-bst/
     *
     * @param root
     * @param key
     * @return
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            //此时 左右子树都不为空
            //找到右子树最小的  或者 左子树最大的。
            TreeNode min = getMin(root.right);
            root.val = min.val;
            //然后在 右子树中删除最小的val
            root.right = deleteNode(root.right, min.val);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        return root;
    }

    private TreeNode getMin(TreeNode root) {
        if (root.left != null) return getMin(root.left);
        return root;
    }
}
