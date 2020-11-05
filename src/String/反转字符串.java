package String;

public class 反转字符串 {
    /**
     * https://leetcode-cn.com/problems/reverse-string/
     * @param s  左右指针
     */
    public void reverseString(char[] s) {
        if (s == null || s.length < 2) return;
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            right--;
            left++;
        }
    }
}
