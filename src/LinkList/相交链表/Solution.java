package LinkList.相交链表;

import DataStructure.ListNode;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
     * 遍历两个链表然后到最后一个节点分别指向对方的链表。
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB) {
            //如果a为空就指向b链表 ，如果 b空就指向 a链表
            curA = curA == null ? headB : curA.next;
            curB = curB == null ? headA : curB.next;
        }
        return curA;
    }
}
