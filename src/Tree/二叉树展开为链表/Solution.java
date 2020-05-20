package Tree.二叉树展开为链表;

import DataStructure.TreeNode;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
     * 就是前序遍历 把左子树 放到右子树，
     * 然后右子树赋值给左子树最右边的子树。
     * 然后遍历在对右子树进行同样操作哦
     * @param root
     */
    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left != null) {
                //储存右子树
                TreeNode oldNode = root.right;
                root.right = root.left;
                root.left = null;
                TreeNode rightNode = root;
                while (rightNode.right != null) {
                    rightNode = rightNode.right;
                }
                rightNode.right = oldNode;
            }
            root = root.right;
        }
    }
}
