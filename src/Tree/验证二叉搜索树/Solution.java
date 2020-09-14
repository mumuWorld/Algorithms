package Tree.验证二叉搜索树;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private int lastValue = Integer.MIN_VALUE;
    /**
     * https://leetcode-cn.com/problems/validate-binary-search-tree/
     * 验证条件
     * 1 中序遍历 是升序
     */
    boolean solution_1(TreeNode treeNode) {
        if (treeNode == null) return true;
        boolean left = solution_1(treeNode.left);
        if (!left) {
            return left;
        }
        if (treeNode.val <= lastValue) {
            return false;
        }
        lastValue = treeNode.val;
        boolean right = solution_1(treeNode.right);
        return right;
    }

    /**  https://leetcode-cn.com/problems/legal-binary-search-tree-lcci/
     * 层次遍历 比较上、下限
     * @param root
     * @return
     */
    boolean solution_2(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> nodes = new LinkedList<>();
        //存放下界的队列
        Queue<Integer> minQ = new LinkedList<>();
        //存放上界的队列
        Queue<Integer> maxQ = new LinkedList<>();

        nodes.offer(root);
        minQ.offer(null);
        maxQ.offer(null);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            Integer min = minQ.poll();
            Integer max = maxQ.poll();
            if ((min != null && node.val <= min) || max != null && node.val >= max) {
                return false;
            }
            TreeNode left = node.left;
            if (left != null) {
                nodes.offer(left);
                //入队
                minQ.offer(min);
                maxQ.offer(node.val);
            }
            TreeNode right = node.right;
            if (right != null) {
                nodes.offer(right);
                minQ.offer(node.val);
                maxQ.offer(max);
            }
        }
        return true;
    }
}
