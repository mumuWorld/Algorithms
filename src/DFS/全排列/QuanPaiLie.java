package DFS.全排列;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuanPaiLie {
    /**
     * https://leetcode-cn.com/problems/permutations/
     * DFS算法
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        List<List<Integer>> results = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        int[] result = new int[nums.length];
        dfs(0,nums, used, result, results);
        return results;
    }

    private void dfs(int idx,int[] nums, boolean[] used,int[] result, List<List<Integer>> results) {
        if (idx == nums.length) {
            List<Integer> nList = new ArrayList<>();
            for (int value : result){
                nList.add(value);
            }
            results.add(nList);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            result[idx] = nums[i];
            dfs(idx + 1, nums, used, result, results);
            //用完重置
            used[i] = false;
        }
    }

    //优化算法
    /**
     * 直接将结果存入 nums
     * 然后每次进行交换。
     * @param nums
     * @return
     */
    public List<List<Integer>> permute_2(int[] nums) {
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
            swap(nums, idx, i);
            dfs_2(idx + 1, nums, results);
            //还原
            swap(nums, idx, i);
        }
    }

    private void swap(int[] nums, int li, int ri) {
        if (li == ri) return;
        int tmp = nums[li];
        nums[li] = nums[ri];
        nums[ri] = tmp;
    }
}
