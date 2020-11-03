package Tree.寻找重复的子树;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 寻找重复的子树 {

    HashMap<String, Integer> map = new HashMap<>();

    List<TreeNode> result = new ArrayList<TreeNode>();

    /**
     * https://leetcode-cn.com/problems/find-duplicate-subtrees/
     * @param root
     * @return
     */
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        orderTree(root);
        return result;
    }

    public String orderTree(TreeNode root) {
        if (root == null) {
            return "#";
        }
        String left = orderTree(root.left);

        String right = orderTree(root.right);

        String nodeStr = left + "," + right + "," + root.val;
        int value = map.getOrDefault(nodeStr, 0);
        if (value == 1) { //防止重复添加
            result.add(root);
        }

        map.put(nodeStr, value + 1);
        return nodeStr;
    }
}
