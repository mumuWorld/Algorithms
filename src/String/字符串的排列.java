package String;

import java.util.HashMap;

public class 字符串的排列 {
    /**
     *  https://leetcode-cn.com/problems/permutation-in-string/
     */
    public boolean checkInclusion(String s1, String s2) {
        int left = 0, right = 0;
        int valid = 0;
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        for(Character ch : s1.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        while (right < s2.length()) {
            Character tmp1 = s2.charAt(right);
            right += 1;
            if (need.containsKey(tmp1)) {
                window.put(tmp1, window.getOrDefault(tmp1,  0) + 1);
                if (window.get(tmp1).equals(need.get(tmp1))) {
                    valid += 1;
                }
            }
            //只需要判断 窗口是否大于 目标长度。
            while (right - left >= s1.length()) {
                if (need.size() == valid) {
                    return true;
                }
                Character tmpLeft = s2.charAt(left);
                left += 1;
                if (need.containsKey(tmpLeft)) {
                    if (window.get(tmpLeft).equals(need.get(tmpLeft))) {
                        valid -= 1;
                    }
                    window.put(tmpLeft, window.getOrDefault(tmpLeft,  0) - 1);
                }
            }
        }
        return false;
    }
}
