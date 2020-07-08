package String.最长无重复子串;

import java.util.HashMap;

public class ZuiChangWuChongFuZiChuan {
    /**
     * 无重复字符的最长子串
     * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     * 滑动窗口法
     * @param s
     * @return
     */
        public int lengthOfLongestSubstring(String s) {
            if (s == null) return 0;
            if (s.length() < 2) return s.length();
            int ans = 0, left = 0;
            HashMap<Character, Integer> map = new HashMap<>(); // current index of character
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    int index = map.get(s.charAt(i));
                    left = Math.max(left, index + 1);
                }
                map.put(s.charAt(i),i);
                ans = Math.max(ans, i - left + 1);
            }
            return ans;
        }
}
