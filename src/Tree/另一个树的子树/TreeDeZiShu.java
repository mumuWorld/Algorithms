package Tree.另一个树的子树;

import DataStructure.TreeNode;

public class TreeDeZiShu {
    /**
     * https://leetcode-cn.com/problems/string-rotation-lcci/comments/
     * 将s 和t 序列化， 看 s中是否包含t
     * @param s
     * @param t
     * @return
     */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null || t == null) return false;
        return postSerialize(s).contains(postSerialize(t));
    }

    private String postSerialize(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        postSerialize(root, stringBuilder);
        return stringBuilder.toString();
    }

    /**
     * 空加入 #!  有值 加入 value!
     * 采用后续遍历
     * @param node
     * @param sb
     */
    private void postSerialize(TreeNode node, StringBuilder sb) {
        if (node.left == null) {
            sb.append("#!");
        } else {
            postSerialize(node.left,sb);
        }
        if (node.right == null) {
            sb.append("#!");
        } else {
            postSerialize(node.right,sb);
        }
        sb.append(node.val).append("!");
    }
}
