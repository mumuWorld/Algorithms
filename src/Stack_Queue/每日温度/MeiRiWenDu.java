package Stack_Queue.每日温度;

import org.junit.Test;

import java.sql.Statement;
import java.util.Arrays;
import java.util.Stack;

public class MeiRiWenDu {
    /**
     * https://leetcode-cn.com/problems/daily-temperatures/
     * 解 找到第一个右侧比当前值大的
     * 类似于  最大二叉树的中的拓展变种
     *
     * @param T
     * @return
     */
    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length == 0) return null;
        int[] ris = new int[T.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < T.length; i++) {
            ris[i] = 0;
        }
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int top = stack.pop();
                ris[top] = i - top;
            }
            stack.push(i);
        }
//        System.out.println(Arrays.toString(ris));
        return ris;
    }

    /**
     * 倒推法 从后往前遍历
     * 双指针。
     * @param T
     * @return
     */
    public int[] dailyTemperatures_m2(int[] T) {
        if (T == null || T.length == 0) return null;
        if (T.length == 1) return new int[]{0};
        int[] values = new int[T.length];
        for (int i = T.length - 2; i >= 0; i--) {
            int j = i + 1;
            while (true) {
                if (T[i] < T[j]) {
                    values[i] = j - i;
                    break;
                } else if(values[j] == 0) {
                    values[i] = 0;
                    break;
                } else if(T[i] == T[j]) { //这一步骤可以省略
                    values[i] = values[j] + j - i;
                    break;
                } else {
                    j = j + values[j];
                }
            }
        }
        return values;
    }
}

