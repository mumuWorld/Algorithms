package LinkList.两数相加;

import DataStructure.ListNode;

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
}
