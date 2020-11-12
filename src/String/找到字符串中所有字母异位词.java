package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 找到字符串中所有字母异位词 {
    /**
     * https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<Integer>();
        int left = 0, right = 0;
        int valid = 0;
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            Character cur = p.charAt(i);
            need.put(cur,need.getOrDefault(cur,0) + 1);
        }

        while (right < s.length()) {
            Character cur = s.charAt(right);
            right += 1;
            if (need.containsKey(cur)) {
                window.put(cur,window.getOrDefault(cur,0) + 1);
                if (window.get(cur).equals(need.get(cur))) {
                    valid += 1;
                }
            }
            while (right - left >= p.length()) {
                if (valid == need.size()) {
                    result.add(left);
                    System.out.println(left);
                }
                Character left_cur = s.charAt(left);
                left += 1;
                if (need.containsKey(left_cur)) {
                    if (window.get(left_cur).equals(need.get(left_cur))) {
                        vailid -= 1;
                    }
                    window.put(left_cur,window.getOrDefault(left_cur,0) - 1);
                }
            }
        }

        return result;
    }
}
