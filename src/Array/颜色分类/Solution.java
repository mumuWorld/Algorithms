package Array.颜色分类;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/sort-colors/
     * 原地排序，常数空间。
     */
    public void sortColors(int[] nums) {
        int i = 0;
        int left = 0;
        int right = nums.length - 1;
        while (i <= right) {
            int v = nums[i];
            if (v == 0) {
                exchange(nums, i, left);
                i++;
                left++;
            } else if (v == 1) {
                i++;
            } else {
                exchange(nums, i, right);
                right--;
            }
        }
    }

    public void exchange(int[] nums, int a, int b) {
        if (a == b) {
            return;
        }
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    /**
     * 双指针做法、三指针
     *
     */


}
