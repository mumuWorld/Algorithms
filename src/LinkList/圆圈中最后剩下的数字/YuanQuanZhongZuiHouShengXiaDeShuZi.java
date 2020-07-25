package LinkList.圆圈中最后剩下的数字;

public class YuanQuanZhongZuiHouShengXiaDeShuZi {
    /**
     * https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/
     * 公式： f(n,m) = ( f(n -1), m) + m) % n ;
     * 约瑟夫环
     */
    public int lastRemaining(int n, int m) {
        if(n == 0) { return 0; }
        return (lastRemaining(n - 1, m) + m) % n;
    }

    //优化非递归
    //模 上 n 和i 主要是为了防止越界
    public int lastRemaining_2(int n, int m) {
        int res = 0;
        //因为要算到n 所以 i < n + 1
        for (int i = 2; i < n + 1; i++) {
            res = (res + m) %i;
        }
        return res;
    }
}
