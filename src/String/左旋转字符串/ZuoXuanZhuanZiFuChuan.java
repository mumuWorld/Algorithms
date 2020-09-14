package String.左旋转字符串;

public class ZuoXuanZhuanZiFuChuan {
    /**
     * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
     * 左旋转字符串
     */
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
