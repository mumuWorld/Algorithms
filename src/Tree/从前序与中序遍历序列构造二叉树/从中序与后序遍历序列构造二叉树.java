package Tree.从前序与中序遍历序列构造二叉树;

import DataStructure.TreeNode;

public class 从中序与后序遍历序列构造二叉树 {
    /**
     * https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder,int postStart, int postEnd) {
        if (inStart > inEnd) {
            return null;
        }
        //后续遍历的最后一个为父节点
        int val = postorder[postEnd];
        //找到中序的父节点index
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == val) {
                index = i;
                break;
            }
        }
        //中序的左子节点个数
        int leftSize = index - inStart;
        //构造新的节点
        TreeNode root = new TreeNode(val);
        root.left = build(inorder, inStart, index  - 1, postorder, postStart, postStart + leftSize -1);
        root.right = build(inorder, index + 1, inEnd, postorder, postStart + leftSize, postEnd - 1);
        return root;
    }
}
