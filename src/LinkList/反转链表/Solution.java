package LinkList.反转链表;

import DataStructure.ListNode;

public class Solution {
    /** 反转链表
     *  https://leetcode-cn.com/problems/reverse-linked-list/solution/dong-hua-yan-shi-206-fan-zhuan-lian-biao-by-user74/
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        ListNode tmp = null;
        while (current != null) {
            tmp = current.next; //保存下一个节点
            current.next = pre; //当前节点指向前一个节点
            pre = current;      //前一个节点指向当前节点
            current = tmp;      //当前节点指向 tmp(下一个节点)
        }
        return pre;
    }
}
