package Tree.最大二叉树;

import DataStructure.TreeNode;

import java.util.Stack;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/maximum-binary-tree/
     * 递归做法
     *
     * @param nums
     * @return
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null) return null;
        TreeNode head = findRoot(nums, 0, nums.length);
        return head;
    }

    /*返回 [l, r) 之间的根节点 也就是最大值*/
    private TreeNode findRoot(int[] nums, int l, int r) {
        if (l == r) return null;
        //最大索引值
        int maxIdx = l;
        for (int i = l; i < r; i++) {
            if (nums[i] > nums[maxIdx]) { //遍历l - r 之间寻找最大index
                maxIdx = i;
            }
        }
        TreeNode maxNode = new TreeNode(nums[maxIdx]);
        maxNode.left = findRoot(nums, l, maxIdx);
        maxNode.right = findRoot(nums, maxIdx + 1, r);
        return maxNode;
    }

    /**
     * 返回一个数组、数组里面存每个节点的父节点的索引。
     * 解：利用栈 求左、右边第一个比它大的数。
     * 栈 里面的元素要求 单调递减。
     *
     * @param nums
     * @return
     */
    public int[] parentBinaryTreeArray(int[] nums) {
        int[] lis = new int[nums.length];
        int[] ris = new int[nums.length];
        //存放index的栈  栈内元素 单调递减
        Stack<Integer> stack = new Stack<>();
        //数组初始化
        for (int i = 0; i < nums.length; i++) {
            lis[i] = -1;
            ris[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            while (!stack.empty() && nums[i] > nums[stack.peek()]) {
                //pop出来的元素的右边最大的就是当前index
                ris[stack.pop()] = i;
            }
            //栈可能为null
            lis[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        int[] pis = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[lis[i]] == -1 && nums[ris[i]] == -1) {
                pis[i] = -1;
                continue;
            }
            if (nums[lis[i]] == -1) {
                pis[i] = ris[i];
            } else if (nums[ris[i]] == -1) {
                pis[i] = lis[i];
            } else if (nums[lis[i]] < nums[ris[i]]) {
                pis[i] = lis[i];
            } else {
                pis[i] = ris[i];
            }
        }
        return pis;
    }
}
