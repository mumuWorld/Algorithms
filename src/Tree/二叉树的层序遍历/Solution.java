package Tree.二叉树的层序遍历;

import DataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
     * 107. 二叉树的层序遍历 II
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }

        if (root == null) return null;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);

    }
}
