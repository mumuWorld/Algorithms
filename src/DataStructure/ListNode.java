package DataStructure;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }

    public ListNode(int[] listArr) {
        if (listArr == null) { return; }
        ListNode pre = new ListNode(0);
        next = pre;
        for (int i = 0; i < listArr.length; i ++) {
            pre.next = new ListNode(listArr[i]);
            pre = pre.next;
        }
        val = next.val;
        next = next.next;
    }
}

