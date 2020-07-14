package Stack_Queue.有效括号;

import java.util.Stack;

public class YouXiaoKuoHao {
    public boolean isValid(String s) {
        if (s == null) return false;
        char[] cs = s.toCharArray();
        if (cs.length % 2 == 1) { //奇数肯定不合法
            return false;
        }
        Stack<Character> stack = new Stack();
        for (char c: cs) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }
            if (!stack.empty()) {
                if (c == ')') {
                    if (stack.pop() != '(') {
                        return false;
                    }
                } else if (c == '}') {
                    if (stack.pop() != '{') {
                        return false;
                    }
                } else {
                    if (stack.pop() != '[') {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
