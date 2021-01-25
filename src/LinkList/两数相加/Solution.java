package LinkList.两数相加;

import DataStructure.ListNode;

import java.util.Stack;

public class Solution {
    /** https://leetcode-cn.com/problems/add-two-numbers/submissions/
     * 两数相加
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return l2;
        int needPlus = 0;
        ListNode pre = new ListNode(0); //预先指针
        ListNode cur = pre;

        while (l1 != null || l2 != null) { //只有都为空的情况下退出循环
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int tmp = x + y + needPlus;
            needPlus = tmp / 10; //判断是否需要进位
            int value = tmp % 10; //值
            cur.next = new ListNode(value);
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (needPlus == 1) {
            cur.next = new ListNode(needPlus);
        }
        return pre.next;
    }

    /**  https://leetcode-cn.com/problems/add-two-numbers-ii/
     * 两数相加2 不能翻转链表
     * 思路： 利用栈
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers_2(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode head = null;
        int needPlus = 0;
        while (!stack1.empty() || !stack2.empty() || needPlus > 0) {
            int n1 = stack1.empty() ? 0 : stack1.pop();
            int n2 = stack2.empty() ? 0 : stack2.pop();
            int value = n1 + n2 + needPlus;
            int v = value % 10;
            needPlus = value / 10;
            ListNode cur = new ListNode(v);
            cur.next = head;
            head = cur;
        }
        return  head;
    }
}
