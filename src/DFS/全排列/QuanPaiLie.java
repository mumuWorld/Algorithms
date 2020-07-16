package DFS.全排列;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuanPaiLie {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        List<List<Integer>> results = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        int[] result = new int[nums.length];
        dfs(0,nums, used, result, results);
        return results;
    }

    private void dfs(int idx,int[] nums, boolean[] used,int[] result, List<List<Integer>> results) {
        if (idx >= nums.length) {
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
}
