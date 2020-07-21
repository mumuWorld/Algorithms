package String.字符串轮转;

public class ZiFuChuanLunZhuan {
    /*
        https://leetcode-cn.com/problems/string-rotation-lcci/
        s1 = "waterbottle", s2 = "erbottlewat"
 输出：True
    将 s1相加  s2必在s1中。
     */
    public boolean isFlipedString(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;
        return (s1 + s2).contains(s2);
    }
}
