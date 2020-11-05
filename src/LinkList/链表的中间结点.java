package LinkList;

import DataStructure.ListNode;

public class 链表的中间结点 {
    /**
     * https://leetcode-cn.com/problems/middle-of-the-linked-list/
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
