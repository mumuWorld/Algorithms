package Tree.最大BST子树;
import DataStructure.TreeNode;

public class ZuiDaBSTZiShu {
    /**
     * 此题目leetcode 已锁。 无URL
     *
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
     * 实际上是后序遍历
     */
    private Info getInfo(TreeNode root) {
        if (root == null) return null;
        //左子树的最大BST子树信息
        Info li = getInfo(root.left);
        //右子树的最大BST子树信息
        Info ri = getInfo(root.right);
        //以root为根节点的二叉树是BST
        int leftBSTSize = -1,rightBSTSize = -1;
        int min = 0,max = 0;

        if (li == null) { //左边为空
            leftBSTSize = 0;
        } else if (li.root == root && root.val > li.maxV) { //自己 和左节点符合bst
            leftBSTSize = li.size;
            min = li.minV;
        }

        if (ri == null) {//右边为空
            rightBSTSize = 0;
        } else if (ri.root == root && root.val < ri.minV) { //自己和右边符合bst
            rightBSTSize = ri.size;
            max = ri.maxV;
        }

        //左右都符合BST 且自己也符合
        if (leftBSTSize > -1 && rightBSTSize > -1) {
            return new Info(root, 1 + leftBSTSize + rightBSTSize, min,max );
        }

        //以root为根节点的二叉树不是BST
        //左、右子树不为空 && val 大于li的最大值，小于 ri的最小值。
        if (li != null && ri != null) {
            return (li.size > ri.size) ? li : ri;
        }

        return li != null ? li : ri;
    }
    /**
     * 返回节点数量
     */
    private int treeNodeCount(TreeNode root) {
        if (root == null) return 0;
        return 1 + treeNodeCount(root.left) + treeNodeCount(root.right);
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

        public Info(TreeNode root, int size, int maxV, int minV) {
            this.root = root;
            this.size = size;
            this.maxV = maxV;
            this.minV = minV;
        }
    }
}
