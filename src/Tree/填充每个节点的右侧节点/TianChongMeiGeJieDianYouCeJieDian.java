package Tree.填充每个节点的右侧节点;

import DataStructure.TreeNode;

/**
 * https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/
 * 116. 填充每个节点的下一个右侧节点指针
 */
public class TianChongMeiGeJieDianYouCeJieDian {
    public TreeNode connect(TreeNode root) {
        if(root == null) return root;
        connectTwoNode(root.left, root.right);
        return root;
    }

    public void connectTwoNode(TreeNode node1, TreeNode node2) {
        if(node1 == null || node2 == null) return;
        node1.next = node2;
        //链接相同父节点的子节点
        connectTwoNode(node1.left,node1.right);
        connectTwoNode(node2.left,node2.right);
        //链接不同父节点的子节点
        connectTwoNode(node1.right,node2.left);
    }
}
