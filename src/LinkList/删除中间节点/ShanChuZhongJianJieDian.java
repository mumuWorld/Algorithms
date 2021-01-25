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
        ListNode middle = new ListNode(0);
        middle.next = node;
        ListNode last = node;
        ListNode pre = null;
        while (last != null && last.next != null) {
            System.out.println("middle" + middle.val);
            pre = middle;
            middle = middle.next;
            last = last.next.next;
        }
        System.out.println("p->" + pre.next.val + " ,m->" + middle.next.val);

        pre.next = middle.next;
    }

    //然而实际上，这个题访问的是 要删除的节点
    public void deleteNode_right(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
