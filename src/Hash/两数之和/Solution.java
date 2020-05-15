package Hash.两数之和;

import java.util.HashMap;

public class Solution {
    /**
     * 一次哈希算法
     * https://leetcode-cn.com/problems/two-sum/
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) { return null; }
        HashMap<Integer,Integer> cache = new HashMap();
        for (int i = 0; i < nums.length; i++ ) {
            int purpose = target - nums[i];
            if (cache.containsKey(purpose)) {
                int define = cache.get(purpose);
                return new int[] {define, i};
            }
            cache.put(nums[i],i);
        }
        return null;
    }
}
