package Hash.两数之和2;

import java.util.HashMap;

public class LiangShuZhiHe2 {
    /**
     * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
     * 自己的解法
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[]{};
        if (numbers == null || numbers.length == 0) return result;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            int cur = numbers[i];
            int sur = target - cur;
            if (!map.isEmpty() && map.get(sur) != null) {
                return new int[]{map.get(sur) + 1, i + 1};
            }
            map.put(cur,i);
        }
        return result;
    }
    //优化 还可以用双指针 ，两边同时遍历 到数组中点。
}
