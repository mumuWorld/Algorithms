package String.最长回文子串;

import javax.swing.text.html.CSS;

public class ZuiChangHuiWenZiChuan {
    /**
     * https://leetcode-cn.com/problems/longest-palindromic-substring/
     * 最长回文子串
     * 动态规划 时间复杂 n^2
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return s;
        char[] chars = s.toCharArray();
        boolean[][] dp = new boolean[chars.length][chars.length];
        int beginIndex = 0;
        //回文子串的长度最少为1
        int maxLength = 1;
        //计算顺序从左到右  从下到上。
        for (int i = chars.length - 1; i > -1; i--) {
            //j 必须大于等于i才有意义
            for (int j = i; j < chars.length; j++) {
                int curLength = j - i + 1;
                //i 和j 的字符必须相等 并且 长度等于2 或者 左下角的字符串为回文子串
                dp[i][j] = (chars[i] == chars[j]) && (curLength <= 2 || dp[i + 1][j - 1]);
                if (dp[i][j]) { //为回文子串
                    if (curLength > maxLength) {
                        beginIndex = i;
                        maxLength = curLength;
                    }
                }
            }
        }
        return new String(chars, beginIndex, maxLength);
    }

    //解法2： 扩展中心法
    //每个元素 和 间隙 为中心，进行扩散。
    public String longestPalindrome_2(String s) {
        if (s == null || s.length() < 2) return s;
        char[] chars = s.toCharArray();
        int beginIndex = 0;
        //回文子串的长度最少为1
        int maxLength = 1;
        for (int i = chars.length - 2; i > 0; i--) {
            //以当期字符为中心 拓展
            int maxItem = palindromeLength(chars, i - 1, i + 1);
            //以间隙为中心 拓展
            int maxSpacing = palindromeLength(chars, i,i + 1);
//            if (maxItem > maxItem || maxSpacing > maxItem) {
//                if (maxItem > maxSpacing) {
//                    beginIndex = (int) (i - (maxItem - 1) * 0.5);
//                    maxLength = maxItem;
//                } else {
//                    beginIndex = (int) (i - maxSpacing * 0.5 + 1);
//                    maxLength = maxSpacing;
//                }
//            }
            int maxL = Math.max(maxItem, maxSpacing);
            if (maxL > maxLength) {
                beginIndex = i - ((maxL - 1) >> 1);
                maxLength = maxL;
            }
        }
        //处理 0号字符为间隙 拓展
//        int specLength = palindromeLength(chars, 0,1);
//        if (specLength > maxLength) {
//            return new String(chars,0,specLength);
//        }
        if (chars[0] == chars[1] && maxLength < 2) {
            beginIndex = 0;
            maxLength = 2;
        }
        return new String(chars,beginIndex,maxLength);
    }

    /**
     * 从l开始向左、从r开始向右扫描，获得的最长回文子串的长度。
     * @param cs
     * @param left
     * @param right
     */
    private int palindromeLength(char[] cs, int left, int right) {
        while (left >= 0 && right < cs.length && cs[left] == cs[right]) {
            left--;
            right++;
        }
        //当为回文的时候 l 和r 必定是不符合的。
        return right - left - 1;
    }
}
