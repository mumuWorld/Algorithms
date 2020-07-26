package Other.会议室;

import java.util.Arrays;

public class HuiYiShi {
    /** 此题没有权限
     *  给定一个会议数组 ，确定此人是否可以参加全部会议。
     * 基础思路： 排序 ： 按照会议的开始时间排序
     */
    public boolean canAttendMeeting(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return true;
        //按照会议时间从小到大排序
        Arrays.sort(intervals,(m1, m2) -> {
            return m1[0] - m2[0];
        });
        //遍历所有会议
        for (int i = 1; i < intervals.length; i++) {
            //判断开始时间是否小于结束时间。
            if (intervals[i][0] < intervals[i-1][1]) return false;
        }
        return true;
    }
}
