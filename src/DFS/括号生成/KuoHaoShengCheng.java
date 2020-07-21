package DFS.括号生成;

import java.util.ArrayList;
import java.util.List;

public class KuoHaoShengCheng {
    /**
     *  https://leetcode-cn.com/problems/generate-parentheses/
     * 左右括号数量相同是只能选择 左 括号
     * 只有剩余左右括号数量不相同时才可以选择左 右。
     */
    public List<String> generateParenthesis(int n) {
        List<String> list =  new ArrayList<String>();
        if (n < 0) return list;
        //等于0的情况可以优化掉。
//        if (n == 0) {
//            list.add("");
//            return list;
//        }
        //存放每一层的选择
        char[] result = new char[n * 2];
        dfs(0,result, list, n, n);
        return list;
    }

    private void dfs(int idx, char[] result,List<String> list,int leftCount,int rightCount) {
        if (idx == result.length) {
            list.add(new String(result));
            return;
        }
        //选左括号
        if (leftCount > 0) {
            result[idx] = '(';
            dfs(idx + 1, result, list, leftCount - 1, rightCount);
        }
        //选右括号
        if (rightCount > 0 && leftCount != rightCount) {
            result[idx] = ')';
            dfs(idx + 1, result, list, leftCount, rightCount - 1);
        }
    }
}
