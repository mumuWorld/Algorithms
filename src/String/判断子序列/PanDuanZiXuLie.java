package String.判断子序列;

public class PanDuanZiXuLie {
    /** https://leetcode-cn.com/problems/is-subsequence/comments/
     *  双指针，如果短的能移动到末尾，则证明是子序列
     */
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null || s.length() > t.length()) return false;
        int ls = 0, lt = 0;
        while (ls < s.length() && lt < t.length()) {
            if (t.charAt(lt) == s.charAt(ls)) {
                ls++;
            }
            lt++;
        }
        return ls == s.length();
    }
}
