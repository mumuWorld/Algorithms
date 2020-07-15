package Tree.最大BST子树;
import DataStructure.TreeNode;

public class ZuiDaBSTZiShu {
    /**
     * 此题目leetcode 已锁。
     * 1 自顶向下的判断，从根节点依次判断是否是 二叉搜索树，然后返回节点数量。
     *   此方法 为前序遍历方式，O(n^2)
     *  2 优化。自底向上，后序遍历方式，
     */
//    public int MaxBST(TreeNode root) {
//        if (root == null) return 0;
//        if (isBST(root)) return treeNodeCount(root);
//        return Math.max(MaxBST(root.left), MaxBST(root.right));
//    }
    public int MaxBST(TreeNode root) {
        return  (root == null) ? 0 : getInfo(root).size;
    }

    /**
     * 返回以root为根节点的二叉树的最大BST子树的信息
     */
    private Info getInfo(TreeNode root) {
        if (root == null) return null;
        //左子树的最大BST子树信息
        Info li = getInfo(root.left);
        //右子树的最大BST子树信息
        Info ri = getInfo(root.right);
        return null;
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
     * 二叉树子树信息
     */
    private static class Info {
        //根节点
        public TreeNode root;
        /** 节点总数 */
        public int size = 1;
        /** 最大值*/
        public int maxV = 0;
        /** 最小值*/
        public int minV = 0;
    }
}
