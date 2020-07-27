package Other.接雨水;

public class JieYuShui {
    /** https://leetcode-cn.com/problems/trapping-rain-water/
     * 
     * @param height
     * @return
     */
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int result = 0;
        int lowMax = 0;
        int l = 0, r = height.length -1;
        while (l < r) {
            //取左右边最小的一个 然后移动小的
            int low = height[height[l] <= height[r] ? l++ : r--];
            //取最大的边界值
            lowMax = Math.max(low, lowMax);
            //计算 水的数量 就是 lowMAX - 最低值。
            result += lowMax - low;
        }
        return result;
    }
}

