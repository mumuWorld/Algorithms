package Tree.二叉树遍历;

import DataStructure.TreeNode;

import java.util.*;

public class TreeOrder {
    /** 中序遍历
     * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
     * 利用栈 做非递归遍历
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            result.add(top.val);
            cur = top.right;
        }
        return result;
    }

    /**
     * 前序遍历
     * @param root
     * @return
     */
    public List<Integer> beforeOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            if (cur != null) {  //两种情况：1.栈不空；2.栈空
                result.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            } else { //一种情况：当前节点为空，但栈不空
                cur = stack.pop();
                cur = cur.right;
            }
        }
        return result;
    }

    /** 层次遍历
     *  https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        TreeNode cur = root;
        while (!deque.isEmpty()) {
            int n = deque.size();
            List<Integer> tmp = new ArrayList<>();
            //将 前n个加入 数组
            for (int i = 0; i < n; i++) {
                cur = deque.poll();
                tmp.add(cur.val);
                if (cur.left != null) {
                    deque.add(cur.left);
                }
                if (cur.right != null) {
                    deque.add(cur.right);
                }
            }
            result.add(tmp);
        }
        return result;
    }
}
