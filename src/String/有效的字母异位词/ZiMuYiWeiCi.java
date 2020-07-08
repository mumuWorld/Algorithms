package String.有效的字母异位词;

public class ZiMuYiWeiCi {
    /**
     * https://leetcode-cn.com/problems/valid-anagram/
     * 只要两个字符串的每个字符的字母数量一样。就为true
     */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        //提高效率，先将字符串转换成两个数组  空间换时间
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int[] counts = new int[26];
        for (int i = 0; i < sChars.length; i++) {
            counts[sChars[i] - 'a']++;
        }
        for (int i = 0; i < tChars.length; i++) {
            if (--counts[tChars[i] - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
