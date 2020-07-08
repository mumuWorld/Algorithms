package String.翻转字符串里的单词;

public class FanZhuanZiFuChuanLiDeDanCi {
    /**
     * https://leetcode-cn.com/problems/reverse-words-in-a-string/
     * 1 先去掉多余空格 2 全部逆序 3 对每个单词分别逆序
     */
    public String reverseWords(String s) {
        if (s == null) return s;
        char[] chars = s.toCharArray();
        //前一个字符是否 为空格
        boolean space = true;
        //当前指针
        int cur = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                chars[cur] = chars[i];
                space = false;
                cur++;
            } else if (space == false) { //false 表示前面还没插入空格
                chars[cur] = ' ';
                space = true;
                cur++;
            }
        }
        //需要逆序的长度
        int len = space ? cur - 1 : cur;
        if (len <= 0) { //全是空格的情况
            return "";
        }
        //对整体逆序
        reverse(chars, 0, len);
        //不是空格的前置标志位
        int pre = 0;
        //对每个单词逆序
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' ') {
                reverse(chars, pre, i);
                pre = i + 1;
            }
        }
        //将最后一个单词反转
        reverse(chars, pre, len);
        return new String(chars, 0, len);
    }

    /**
     * 对source 反转 [l , r)
     * @param source
     * @param l
     * @param r
     */
    private void reverse(char[] source, int l, int r) {
        r--;
        while (l < r) {
            char tmp = source[l];
            source[l] = source[r];
            source[r] = tmp;
            l++;
            r--;
        }
    }
}
