package Stack_Queue.最小栈;

import java.util.Stack;

/* https://leetcode-cn.com/problems/min-stack/
* 设计一个最小栈
* */
public class MinStack {
    private Stack<Integer> stack;
    /*用一个最小栈保存当前的最小值*/
    private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.empty()) {
            minStack.push(x);
        } else {
            minStack.push(Math.min(x, getMin()));
        }
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


}
class MinStack2 {
    private MinNode head;
    public MinStack2() {
        head = new MinNode(0, Integer.MAX_VALUE, null);
    }
    public void push(int x) {
        head = new MinNode(x,Math.min(x,getMin()),head);
    }
    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class MinNode {
        int val;
        int min;
        MinNode next;
        MinNode(int val, int min, MinNode next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}