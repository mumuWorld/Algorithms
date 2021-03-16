package Array;

public class 连续子数组最大和 {

    /* https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
        连续子数组最大和
     */
    public int maxSubArray(int[] nums) {
        if (nums.length < 1) return 0;
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
