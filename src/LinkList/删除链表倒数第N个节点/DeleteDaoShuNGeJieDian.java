package LinkList.删除链表倒数第N个节点;

import DataStructure.ListNode;


public class DeleteDaoShuNGeJieDian {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = new ListNode();
        tmp.next = head;
        //一开始要指向 前置头结点
        ListNode pre = tmp;
        int cur = 0;
        while (head != null) {
            head = head.next;
            if (cur >= n) {
                pre = pre.next;
            } else {
                cur++;
            }
        }
        pre.next = pre.next != null ? pre.next.next : pre.next;
        return tmp.next;
    }
}
