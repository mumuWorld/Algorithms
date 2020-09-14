package Tree.二叉树遍历;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Traversal {
    /**
     * 递归中序方法
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal_1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        traversal(root, list);
        return list;
    }

    public void traversal (TreeNode root, List<Integer> list)  {
        if (root.left != null) {
            traversal(root.left, list);
        }
        list.add(root.val);
        if (root.right != null) {
            traversal(root.right,list);
        }
    }

    /**
     * 迭代中序遍历
     * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal_2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}
