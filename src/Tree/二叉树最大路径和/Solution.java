package Tree.二叉树最大路径和;


import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int maxPathSum(TreeNode root) {
        findMaxSum(root);
        return sum;
    }

    int sum = Integer.MIN_VALUE;

    int findMaxSum (TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(findMaxSum(root.left),0);
        int right = Math.max(findMaxSum(root.right),0);
        sum = Math.max(sum, root.val + left + right);
        return root.val + Math.max(left, right);
    }

//    public int maxPathSum2(TreeNode root) {
//        Stack<TreeNode> mainStack = new Stack<>();
//        Stack<TreeNode> helpStack = new Stack<>();
//        mainStack.push(root);
//
//        while (!mainStack.empty()) {
//            TreeNode node = mainStack.pop();
//            helpStack.push(node);
//            int left = 0;
//            if (node.left != null) {
//                mainStack.push(node.left);
//            }
//            if (node.right != null) {
//                mainStack.push(node.right);
//            }
//        }
//        List list = new ArrayList<Integer>();
//        while (!helpStack.empty()) {
//            TreeNode node = helpStack.pop();
//            list.add(node.val);
//        }
//        return list;
    }
