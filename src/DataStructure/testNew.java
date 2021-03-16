package DataStructure;

import java.lang.reflect.Method;

public class testNew {
    int a[] = {1,2,3,5,4,5};
//        输入: nums = [-2,1,-3,4,-1,2,1,-5,4]

    public int maxSum(int[] nums) {

        int left = 0;
        int right = 0;
        int curMax = 0;

        while (right < nums.length) {
            int cur = nums[left];
            curMax += cur;
        }

        return curMax;
    }
    Method
            函数的派发
}
