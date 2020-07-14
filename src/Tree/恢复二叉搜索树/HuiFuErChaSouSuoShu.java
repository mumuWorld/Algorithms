package Tree.恢复二叉搜索树;

import DataStructure.TreeNode;

public class HuiFuErChaSouSuoShu {
    /**
     * https://leetcode-cn.com/problems/recover-binary-search-tree/
     * 二叉搜索树 中序遍历是升序的。
     * 只有两个节点错误，进行交换
     */
    private TreeNode preNode;
    //逆序对中比较大的节点
    private TreeNode firstNode;
    //逆序对中比较小的节点
    private TreeNode secondNode;

    public void recoverTree(TreeNode root) {
        findWrongNode(root);
        int tmp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = tmp;
    }

    public void findWrongNode(TreeNode root) {
        if (root == null) {
            return;
        }
        findWrongNode(root.left);

        if (preNode != null && preNode.val > root.val) {
            secondNode = root;
            if (firstNode != null) return;
            firstNode = preNode;
        }
        root = preNode;
        findWrongNode(root.right);
    }

    //解法2
    //二叉树的Morris遍历  线索二叉树
    public void recoverTree2(TreeNode root) {

    }

}
