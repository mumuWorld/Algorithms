package Tree.N叉树的后序遍历;

import DataStructure.Node;

import java.util.ArrayList;
import java.util.List;

public class NTreeHouXuBianLi {
    /**
     * https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
     */
    public List<Integer> postorder(Node root) {
        if (root == null) return new ArrayList<>();
        return addChild(root);
    }

    private List<Integer> addChild(Node root) {
        List<Integer> list = new ArrayList<>();
        for (Node node : root.children) {
            list.addAll(addChild(node));
        }
        list.add(root.val);
        return list;
    }
}
