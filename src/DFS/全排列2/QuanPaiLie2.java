package DFS.全排列2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuanPaiLie2 {
    /**
     * https://leetcode-cn.com/problems/permutations-ii/
     * 去重
     * @param nums
     * @return
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        List<List<Integer>> results = new ArrayList<>();
        dfs_2(0,nums, results);
        return results;
    }
    private void dfs_2(int idx,int[] nums, List<List<Integer>> results) {
        if (idx == nums.length) {
            List<Integer> nList = new ArrayList<>();
            for (int value : nums){
                nList.add(value);
            }
            results.add(nList);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            if (isRepeat(nums,idx,i)) continue;
            swap(nums, idx, i);
            dfs_2(idx + 1, nums, results);
            //还原
            swap(nums, idx, i);
        }
    }

    //保证一个数字在index位置只出现一次。
    private boolean isRepeat(int[] nums, int idx, int i) {
        for (int j = idx; j < i; j++) {
            if (nums[j] == nums[i]) return true;
        }
        return false;
    }

    private void swap(int[] nums, int li, int ri) {
        if (li == ri) return;
        int tmp = nums[li];
        nums[li] = nums[ri];
        nums[ri] = tmp;
    }

}
