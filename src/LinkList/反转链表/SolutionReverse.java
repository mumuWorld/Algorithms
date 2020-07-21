package LinkList.反转链表;

import DataStructure.ListNode;

public class SolutionReverse {
    /** 反转链表
     *  https://leetcode-cn.com/problems/reverse-linked-list/solution/dong-hua-yan-shi-206-fan-zhuan-lian-biao-by-user74/
     * @param head
     * @return
     */
    static public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode tmp = null;
        while (head != null) {
            tmp = head.next; //保存下一个节点
            head.next = pre; //当前节点指向前一个节点
            pre = head;      //前一个节点指向当前节点
            head = tmp;      //当前节点指向 tmp(下一个节点)
        }
        return pre;
    }
}
