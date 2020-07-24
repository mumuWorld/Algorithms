package DFS.路径总和2;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LuJingZongHe2 {
    /**
     * https://leetcode-cn.com/problems/path-sum-ii/
     */
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        dfs(root, sum, new ArrayList<>(),list);
        return list;
    }

    private void dfs(TreeNode root,int sum, List<Integer> result,List<List<Integer>> results) {
        if (root == null) return;
        result.add(root.val);
        sum -= root.val;
        //叶子节点 执行完不能return 要进行remove一次。
        if (root.left == null && root.right == null) {
            if (sum == 0) {
                results.add(new ArrayList<>(result));
            }
        } else {
            dfs(root.left, sum, result, results);
            dfs(root.right, sum, result, results);
        }
        result.remove(result.size() - 1);
    }
}
