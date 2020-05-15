package String.最长公共前缀;

public class Solution {
    /**最长公共前缀
     * https://leetcode-cn.com/problems/longest-common-prefix/solution/
     * @param strs
     * @return 默认去第一个元素作为比较元素， 然后凉凉
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) { return ""; }
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            String current = strs[i];
            for (; j < ans.length() && j < current.length() ; j++) {
                if (ans.charAt(j) != current.charAt(j)) {//当不相等时就是没有共同前缀了
                    break;
                }
            }
            ans = ans.substring(0,j);
            if (ans.equals("")) { //如果遍历还没结束ans就为空了。就直接返回了。没必要再轮序了。
                return ans;
            }
        }
        return ans;
    }
}
