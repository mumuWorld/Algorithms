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

    /**
     * 递归实现翻转链表
     * @param head
     * @return
     */
    public ListNode reverseList_diGui(ListNode head) {
        if (head.next == null) return head;
        ListNode last = reverseList_diGui(head.next);
        head.next.next = head;
        head.next = null;
        return  last;
    }

    /**
     * 翻转链表的前 n 个结点
     */
    //后置结点
    ListNode successor = null;
    public ListNode reverseList_N(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode last = reverseList_N(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return  last;
    }

    /** https://leetcode-cn.com/problems/reverse-linked-list-ii/
     *  92. 反转链表 II   m -n 之间。
     * @return
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1) {
            return reverseList_N(head, n);
        }
        head.next = reverseBetween(head.next, m - 1,n-1);
        return head;
    }

    /**
     *  非递归解法 解法2
     */
    public ListNode reverseBetween_2(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 1; i < m; i++){
            pre = pre.next;
        }
        head = pre.next;
        for(int i = m; i < n; i++){
            ListNode nex = head.next;
            head.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
        }
        return dummy.next;
    }

}
