package Other.Pow;

public class PowXY {
    /** https://leetcode-cn.com/problems/powx-n/
     *  快速幂 分治的思想  时间 log(n)
     *  递归方法。
     *  注：负的奇数向右移一位 等于 -7 - 1 / 2 eg: -7 >> 1 = -4; 而不是 —3
     */
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == -1) return 1 / x;
        //是否为奇数
        boolean odd = (n & 1) == 1;
        System.out.println("n = " + n);
        double half = myPow(x, n >> 1);
        half *= half;
        System.out.println("half = " + half);
        //奇数需要 再乘以 本身。
        return odd ? (half * x) : half;
    }

    //补充 快速幂的非递归写法
    public double myPow2(double x, int n) {
        //n是否为负
        boolean neg = n < 0 ;
        //转换成正数。 因为负数会比 正数 + 1 所以直接转成正数可能会溢出
        //所以需要转成long
        long y = neg ? -(long)n : n;
         double res = 1.0;
         while (y > 0) {
             if ((y & 1) == 1) {
                 res *= x;
             }
             x *= x;
             //舍弃掉最后一位。
             y = y >> 1;
         }
         return neg ? 1 / res : res;
    }
    //补充 x^y %p  => x的y次方 对p 取模
    // (a * b) %p == ((a%p) * (b%p)) %p
    
}
