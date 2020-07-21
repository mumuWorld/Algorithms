package LinkList.删除中间节点;

import DataStructure.ListNode;

public class ShanChuZhongJianJieDian {
    /**
     * https://leetcode-cn.com/problems/delete-middle-node-lcci/
     * 初步判断双指针
     * 慢指针 先指空
     * 快指针 指头结点
     */
    public void deleteNode(ListNode node) {
        if (node == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
