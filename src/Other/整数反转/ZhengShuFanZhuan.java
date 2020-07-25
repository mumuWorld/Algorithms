package Other.整数反转;

public class ZhengShuFanZhuan {
    /**
     * https://leetcode-cn.com/problems/reverse-integer/
     * 注意越界
     * @param x
     * @return
     */
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int pre = res;
            res = pre * 10 + x %10;
            //判断是否越界 就是判断是否等于原数值
            if ((res - x%10) /10 != pre) return 0;
            x /= 10;
        }
        return res;
    }
}
