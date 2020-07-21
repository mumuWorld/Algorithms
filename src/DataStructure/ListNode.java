package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode () {
        val = 0;
    }
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
        val = next.next.val;
        next = next.next.next;
    }

    public List<Integer> transformArray() {
        List<Integer> array = new ArrayList<>();
        array.add(val);
        ListNode preNode = next;
        while (preNode != null) {
            array.add(preNode.val);
            preNode = preNode.next;
        }
        return array;
    }

    @Override
    public String toString() {
        return transformArray().toString();
    }
}

