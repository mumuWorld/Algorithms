package Tree.从前序与中序遍历序列构造二叉树;

import DataStructure.TreeNode;

public class 从前序与中序遍历序列构造二叉树 {
    /**
     * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) return null;
        return buildOrderTree(preorder, 0, preorder.length - 1,
                inorder, 0 ,inorder.length - 1);
    }

    public TreeNode buildOrderTree(int[] preorder,int preStart,int preEnd,
                                   int[] inOrder, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        //找到中序遍历的index
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (root.val == inOrder[i]) {
                index = i;
                break;
            }
        }

        // 左子树的节点个数
        int leftSize = index - inStart;

        root.left = buildOrderTree(preorder, preStart + 1, preStart + leftSize,
                inOrder, inStart, index - 1);

        root.right = buildOrderTree(preorder, preStart + leftSize + 1, preEnd,
                inOrder, index + 1, inEnd);
        return root;
    }
}
