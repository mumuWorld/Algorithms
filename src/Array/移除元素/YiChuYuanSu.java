package Array.移除元素;

public class YiChuYuanSu {
    /**
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null) return 0;
        int removeCount = 0;
        int ri = nums.length - 1;
        for (int i = 0; i <= ri; i++) {
            if (nums[i] == val) {
                //一定要让右侧标志位 不能= i。
                while (nums[ri] == val && ri > i) {
                    ri--;
                    removeCount++;
                }
                if (ri > i) {
                    nums[i] = nums[ri];
                }
                ri--;
                removeCount++;
            }
        }
        return nums.length - removeCount;
    }
}
