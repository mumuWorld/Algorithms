package Other.会议室2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HuiYiShi2 {
    /** 此题没有权限
     *  至少需要多少间会议室。
     *  思路： 利用小顶堆， 存放前一个会议的结束时间。
     */
    public int canAttendMeeting(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        //按照会议时间从小到大排序
        Arrays.sort(intervals,(m1, m2) -> {
            return m1[0] - m2[0];
        });
        //最小堆  java 默认就是最小
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            int startTime = intervals[i][0];
            //i 会议开始时间 >= 堆顶最小结束时间
            if (startTime >= heap.peek()) {
                heap.remove();
            }
            //将会议加入
            heap.add(intervals[i][1]);
        }
        return heap.size();
    }
}
