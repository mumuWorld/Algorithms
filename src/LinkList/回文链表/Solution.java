package LinkList.回文链表;

import LinkList.反转链表.SolutionReverse;
import DataStructure.ListNode;

import java.util.List;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/palindrome-linked-list/
     * 中间节点： 下一个节点是后半部分节点的开始。
     * 1 找到中间节点， 2 翻转右半部分链表  3 依次对比左边和右边
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        //只有两个节点
        if (head.next.next == null) return head.val == head.next.val;
        ListNode middle = middleNode(head);
        ListNode rHead = SolutionReverse.reverseList(middle.next);
        ListNode lHead = head;
        ListNode rOldHead = rHead;
        while (rHead != null) {
            if (rHead.val != lHead.val) return false;
            rHead = rHead.next;
            lHead = lHead.next;
        }
        //如果需要恢复被反转的回文链表 右侧链表
//        SolutionReverse.reverseList(rOldHead);
        return true;
    }

    /**
     * 查找中点链表。 快慢指针
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

//默写一遍反转链表
     public void reverseNode2(ListNode head) {
        ListNode pre = null;
         ListNode tmp = null;
         while (head != null) {
             tmp = head.next;
             head.next = pre;
             pre = head;
             head = tmp;
         }
    }

}
