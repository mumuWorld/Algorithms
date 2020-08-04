package Array.删除排序数组中的重复项;

import DataStructure.ArrayTools;

public class ShanChuArrayChongFuXiang {
    /**
     * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
     *
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length < 2) return nums.length;
        int result = 0;
        int pre = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[pre]) {
                pre++;
                nums[pre] = nums[i];

            }
        }
        return pre +1;
    }
}
