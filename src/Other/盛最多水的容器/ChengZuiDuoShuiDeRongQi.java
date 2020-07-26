package Other.盛最多水的容器;

public class ChengZuiDuoShuiDeRongQi {
    /** https://leetcode-cn.com/problems/container-with-most-water/
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        if (height == null) return 0;
        //设置左右指针
        int l = 0, r = height.length - 1;
        int max = 0;
        while (l < r) {
            //判断左右最小的， 然后移动最小的。
            int min =  height[l] >= height[r] ? height[r--] : height[l++];
            max = Math.max(max, min * (r - l + 1));
        }
        return max;
    }
}
