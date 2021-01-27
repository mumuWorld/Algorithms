package LinkList;

import DataStructure.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class SimpleLinkList {
    /**
     * https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
     * 二进制链表转整数
     */
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        int count = 0;
        while (!stack.empty()) {
            Integer value = stack.pop();
            sum += (value == 1 ? value * Math.pow(2, count) : 0);
            count++;
        }
        return sum;
    }

    /** https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
     * 剑指 Offer 06. 从尾到头打印链表
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        int[] arr = new int[stack.size()];
        int count = 0;
        while (!stack.empty()) {
            Integer value = stack.pop();
            arr[count++] = value;
        }
        return arr;
    }


    /** https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
     *  83. 删除排序链表中的重复元素
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = head;
        int val = Integer.MAX_VALUE;
        ListNode pre = head;
        while (newHead != null) {
            if (newHead.val == val) {
                pre.next = newHead.next;
                newHead = newHead.next;
                continue;
            }
            val = newHead.val;
            pre = newHead;
            newHead = newHead.next;
        }
        return head;
    }
}
