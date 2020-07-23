package Tree.二叉搜索树中的搜索;

import DataStructure.TreeNode;
import com.sun.org.apache.regexp.internal.REUtil;

public class BSTZhongDeSouSuo {
    /**
     * https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) {
            return root;
        } else if (root.val < val) {
            return searchBST(root.right,val);
        }
        return searchBST(root.left,val);
    }
}
