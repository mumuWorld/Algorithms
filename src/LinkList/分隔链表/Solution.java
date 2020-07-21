package LinkList.分隔链表;

import DataStructure.ListNode;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/partition-list/
     * 1： 分成三部分 小于  大于  然后再组合成一个链表
     */
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        /*构建两个dummy 节点*/
        ListNode lHead = new ListNode();
        ListNode lTail = lHead;
        ListNode rHead = new ListNode();
        ListNode rTail = rHead;
        while (head != null) {
            if (head.val < x) {
                lTail.next = head;
                lTail = head;
            } else {
                rTail.next = head;
                rTail = head;
            }
            head = head.next;
        }
        //遍历完，要将rtail指向 null
        rTail.next = null;
        //拼接： 将左边的尾结点的指向右边的头结点。
        lTail.next = rHead.next;
        return lHead.next;
    }
}
