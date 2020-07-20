package LinkList.圆圈中最后剩下的数字;

public class YuanQuanZhongZuiHouShengXiaDeShuZi {
    /**
     * https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/
     * 公式： f(n,m) = ( f(n -1), m) + m) % n ;
     */
    public int lastRemaining(int n, int m) {
        if(n == 0) { return 0; }
        return (lastRemaining(n - 1, m) + m) % n;
    }
}
