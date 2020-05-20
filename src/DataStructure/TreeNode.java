package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int val;
    TreeNode(int x) {
        val = x;
    }

    /**
     * 后续遍历 非递归
     * @return
     */
    List<Integer> Postorderraversal() {
        Stack<TreeNode> mainStack = new Stack<>();
        Stack<TreeNode> helpStack = new Stack<>();
        mainStack.push(this);

        while (!mainStack.empty()) {
            TreeNode node = mainStack.pop();
            helpStack.push(node);
            if (node.left != null) {
                mainStack.push(node.left);
            }
            if (node.right != null) {
                mainStack.push(node.right);
            }
        }
        List list = new ArrayList<Integer>();
        while (!helpStack.empty()) {
            TreeNode node = helpStack.pop();
            list.add(node.val);
        }
        return list;
    }

}


