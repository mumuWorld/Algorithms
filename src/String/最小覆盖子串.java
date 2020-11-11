package String;

import java.util.HashMap;

public class 最小覆盖子串 {
    /**
     * https://leetcode-cn.com/problems/minimum-window-substring/
     * @return
     */
    public String minWindow(String s, String t) {
        if (t == null || t.length() == 0) return  s;
        int needValue = 0;
        //最小字符串记录
        int start = 0, len = Integer.MAX_VALUE;
        int left = 0, right = 0;
        HashMap <Character,Integer> window = new HashMap<Character, Integer>();
        HashMap <Character,Integer> need = new HashMap<Character, Integer>();
        for (Character cc : t.toCharArray()) {
            Integer tmp = need.getOrDefault(cc, 0);
            need.put(cc, tmp + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            Character cur = s.charAt(i);
            right = i + 1;

            if (need.containsKey(cur)) {
                //将单钱字符入窗口
                Integer tmp = window.getOrDefault(cur, 0);
                window.put(cur, tmp + 1);

                if (window.get(cur).equals(need.get(cur))) {
                    needValue += 1;
                }
            }
            while (needValue == need.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }

                //准备移除leftC
                Character leftC = s.charAt(left);
                left += 1;

                if (need.containsKey(leftC)) {
                    if (window.get(leftC).equals(need.get(leftC))) {
                        needValue -= 1;
                    }
                    //将单字符移除窗口
                    Integer leftT = window.getOrDefault(leftC, 0);
                    window.put(leftC, leftT - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
