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

    /**
     * 倒数第k个节点
     * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode tmp = new ListNode();
        tmp.next = head;
        //一开始要指向 前置头结点
        ListNode pre = tmp;
        int cur = 0;
        while (head != null) {
            head = head.next;
            if (cur >= k) {
                pre = pre.next;
            } else {
                cur++;
            }
        }
        return pre.next;
    }

    /** 面试题 02.02. 返回倒数第 k 个节点
     * https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
     * @param head
     * @param k
     * @return  返回当前节点的val
     */
    public int kthToLast(ListNode head, int k) {
        ListNode pre = head;
        int count = 0;
        while(head != null) {
            head = head.next;
            if (count >= k) {
                pre = pre.next;
            } else {
                count++;
            }
        }
        return pre.val;
    }
}
