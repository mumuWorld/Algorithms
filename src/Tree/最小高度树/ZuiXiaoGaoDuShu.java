package Tree.最小高度树;

import DataStructure.TreeNode;

public class ZuiXiaoGaoDuShu {
    /**
     * https://leetcode-cn.com/problems/minimum-height-tree-lcci/
     * 找中点
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) return null;
        TreeNode tmp = findRoot(nums, 0, nums.length);
        return tmp;
    }

    private TreeNode findRoot(int[] nums, int left, int right) {
        if (left >= right) return null;
        int mid = (left + right - 1) >> 1;
        TreeNode tmp = new TreeNode(nums[mid]);
        tmp.left = findRoot(nums, left, mid);
        tmp.right = findRoot(nums, mid + 1,right);
        return tmp;
    }
}
