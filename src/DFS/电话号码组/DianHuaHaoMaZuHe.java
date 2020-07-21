package DFS.电话号码组;

import java.util.ArrayList;
import java.util.List;

public class DianHuaHaoMaZuHe {
    /**
     * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
     * 排列组合 用 DFS组合  深度优先
     */
    private char[][] lettersArray = {
            {'a','b','c'},{'d','e','f'},
            {'g','h','i'}, {'j','k','l'},{'m','n','o'},
            {'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}
    };
    private  char[] cs;
    private List<String> list;
    public List<String> letterCombinations(String digits) {
        if (digits == null) return null;
        list = new ArrayList<>();
        cs = digits.toCharArray();
        if (cs.length == 0) return list;
        string = new char[cs.length];
        dfs(0);
        return list;
    }
    private char[] string;

    /**
     * index表示当前在第 几层
     * @param index
     */
    private void dfs(int index) {
        //已经进入最后一层
        if (index == cs.length) {
            //加入总的结构
            list.add(new String(string));
            return;
        }
        //当前的字符
        char ch = cs[index];
        //先枚举这一层可以做的所有选择
        char[] cur = lettersArray[ch - '2'];
        for (char c: cur){
            string[index] = c;
            dfs(index + 1);
        }
    }
}
