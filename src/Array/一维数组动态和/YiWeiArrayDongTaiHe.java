package Array.一维数组动态和;

import DataStructure.ArrayTools;

import java.util.ArrayList;
import java.util.List;

public class YiWeiArrayDongTaiHe {
    /** 一维数组动态和
     * https://leetcode-cn.com/problems/running-sum-of-1d-array/
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {
        if (nums == null || nums.length < 2) return nums;
        int[] results = new int[nums.length];
        int lastSum = 0;
        for (int i = 0; i < nums.length; i++) {
            lastSum += nums[i];
            results[i] = lastSum;
        }
        return results;
    }

    /** 重新排列数组
     *  https://leetcode-cn.com/problems/shuffle-the-array/
     * @param nums
     * @param n
     * @return
     */
    public int[] shuffle(int[] nums, int n) {
        if (nums == null || nums.length == 0) return nums;
        int[] results = new int[nums.length];
        int left = 0;
        int right = n;
        boolean isLeft = true;
        for (int i = 0; i < nums.length; i++) {
            if (isLeft) {
                results[i] = nums[left++];
                isLeft = false;
            } else {
                results[i] = nums[right++];
                isLeft = true;
            }
        }
        return results;
    }

}
