package String.最长无重复子串;

import java.util.HashMap;

public class ZuiChangWuChongFuZiChuan {
    /**
     * 无重复字符的最长子串
     * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     * 滑动窗口法
     */
        public int lengthOfLongestSubstring(String s) {
            if (s == null) return 0;
            if (s.length() < 2) return s.length();
            //左边一个标志位
            int ans = 0, left = 0;
            HashMap<Character, Integer> map = new HashMap<>(); // current index of character
            for (int i = 0; i < s.length(); i++) {
                //如果包含 标志位为 左边 和前一个index + 1.
                if (map.containsKey(s.charAt(i))) {
                    int index = map.get(s.charAt(i));
                    left = Math.max(left, index + 1);
                }
                //包不包含都push
                map.put(s.charAt(i),i);
                ans = Math.max(ans, i - left + 1);
            }
            return ans;
        }

    public int lengthOfLongestSubstring_m2(String s) {
        if (s == null) return 0;
        if (s.length() < 2) return s.length();
        int left = 0, right = 0;
        int res = 0;
        HashMap<Character, Integer> window = new HashMap<>(); // current index of character

        while (right < s.length()) {
            Character cur = s.charAt(right);
            right += 1;
            window.put(cur, window.getOrDefault(cur, 0) + 1);
            while (window.getOrDefault(cur, 0) > 1) {
                Character leftCur = s.charAt(left);
                left += 1;
                window.put(leftCur, window.getOrDefault(leftCur, 0) - 1);
            }
            res = Math.max(res, right - left);
        }
        return res;
    }


}
