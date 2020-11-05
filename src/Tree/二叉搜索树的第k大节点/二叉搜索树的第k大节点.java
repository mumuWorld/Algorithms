package Tree.二叉搜索树的第k大节点;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 二叉搜索树的第k大节点 {

    /**
     * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
     * @return
     */
    int count = 0, ans = 0;
    public int kthLargest(TreeNode root, int k) {
        help(root,k);
        return ans;
    }

    private void help(TreeNode root, int k) {
        //注意这里是 先从右节点开始 倒序中序
        if (root.right != null) help(root.right, k);
        //先加1 是因为k从1开始
        count += 1;
        if (count == k) {
            ans = root.val;
            return;
        }
        if (root.left != null) help(root.left, k);

    }
}
