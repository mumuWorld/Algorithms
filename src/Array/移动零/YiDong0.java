package Array.移动零;

public class YiDong0 {
    /**
     * https://leetcode-cn.com/problems/move-zeroes/
     * 不是0的值，往前挪。和 零的位置交换。
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        //为当前是0 的位置。
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (cur != i) {
                nums[cur] = nums[i];
                nums[i] = 0;
            }
            cur++;
        }
    }
}
