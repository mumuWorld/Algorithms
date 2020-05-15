package String.翻转字符串里的单词;

public class Solution {
    public String reverseWords(String s) {
        if (s.length() == 0) return s;
        int left = 0;
        int right = s.length() -1;
        while (left < right) {
            char lCh = s.charAt(left);
            if (lCh == ' ') {

            }
        }
        return s;
    }
}
