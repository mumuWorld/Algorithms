package 动态规划.打家劫舍;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/house-robber/
     * @return
     */
    public int solution(int[] nums) {
        int first = 0;
        int second = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = second;
            second = Math.max(first + nums[i], second);
            first = tmp;
        }
        return second;
    }

}
