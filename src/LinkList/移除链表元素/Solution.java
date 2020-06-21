package LinkList.移除链表元素;

import DataStructure.ListNode;

public class Solution {
    /* https://leetcode-cn.com/problems/remove-linked-list-elements/submissions/
    * 就是设置前置节点用了将上一个节点的next指向合适的节点。
    * */
    public ListNode removeElements(ListNode head, int val) {
        ListNode tmpH = new ListNode();
        tmpH.next = head; //临时头结点
        ListNode pre = tmpH; //前置节点。
        while (head != null) {
            if (head.val == val) {
                pre.next = head.next;
            } else {
                pre = head;
            }
            head = head.next;
        }
        return tmpH.next;
    }
}
