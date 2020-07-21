package Stack_Queue.滑动窗口最大值;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/sliding-window-maximum/
     * 双端队列  队首是最大值。
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1) return nums;
        if (k == 1) return nums;

        int[] maxs = new int[nums.length - k + 1];
        //双向链表就是队列  存放的是索引
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++ ) {
            int cVal = nums[i];
            /*只要队列尾部小于当前值就移除*/
            while (!deque.isEmpty() && nums[deque.peekLast()] < cVal) {
                deque.pollLast();
            }
            //当前入队
            deque.offerLast(i);
            //w是滑动窗口的左边index
            int w = i - k + 1;
            if (w < 0) {
                continue;
            }
            //校验对首的合法性
            if (deque.peekFirst() < w) {
                deque.pollFirst();
            }
            //将队手加入数组即为最大值。
            maxs[w] = nums[deque.peekFirst()];
        }
        return maxs;
    }
}
