package Tree.二叉树的层序遍历;

import DataStructure.TreeNode;

import java.util.*;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
     * 107. 二叉树的层序遍历 II
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode tmpNode = queue.poll();
                tmp.add(tmpNode.val);
                if (tmpNode.left != null) {
                    queue.add(tmpNode.left);
                }
                if (tmpNode.right != null) {
                    queue.add(tmpNode.right);
                }
            }
            ret.add(0,tmp);
        }
        return  ret;
    }
}
