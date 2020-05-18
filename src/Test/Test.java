package Test;

import DataStructure.ListNode;

public class Test {
    @test
    public void main() {
        int[] arr = new int[]{7,1,5,3,6,4};
        ListNode node = new ListNode(arr);
        System.out.println(node.val);
    }
}
