package Tree.最大BST子树;
import DataStructure.TreeNode;

public class ZuiDaBSTZiShu {
    /**
     * 此题目leetcode 已锁。
     * 1 自顶向下的判断，从根节点依次判断是否是 二叉搜索树，然后返回节点数量。
     *   此方法 为前序遍历方式，O(n^2)
     *  2 优化。自底向上，后序遍历方式，
     */
    public int MaxBST(TreeNode root) {
        if (root == null) return 0;
        if (isBST(root)) return treeNodeCount(root);
        return Math.max(MaxBST(root.left), MaxBST(root.right));
    }

    /**
     * 返回以root为根节点的二叉树的最大BST子树的信息
     */
    private Info getInfo(TreeNode root) {

    }
    /**
     * 返回节点数量
     */
    private int treeNodeCount(TreeNode root) {
        return 0;
    }

    /**
     * 判断是否是bst树
     */
    private boolean isBST(TreeNode root) {
        return false;
    }

    /**
     * 返回二叉树子树信息
     */
    private static class Info {

    }
}
