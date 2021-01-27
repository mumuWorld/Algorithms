package LinkList;
import DataStructure.ListNode;

public class LinkListTest {
    void test() {
        String test = "test";
        test.toCharArray();
        ListNode pre = null;
        ListNode tmp = null;
        while (head != null) {
            tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return  pre;
    }
}
