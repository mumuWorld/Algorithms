package String.字符串相加;

public class ZiFuChuanXiangJia {
    /**
     * https://leetcode-cn.com/problems/add-strings/
     * 双指针
     */
    public String addStrings(String num1, String num2) {
        if (num1 == null || num2 == null) return num1 == null ? num2 : num1;
        if (num1.length() == 0 || num2.length() == 0) return num1.length() == 0 ? num2 : num1;
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int plus = 0;
        while (i >= 0 || j >= 0) {
            int n1 = i < 0 ? 0 : num1.charAt(i) - '0';
            int n2 = j < 0 ? 0 : num2.charAt(j) - '0';
            int value =  n1 + n2 + plus;
            plus =  value / 10;
            int cur = value % 10;
            sb.append(cur);
            j--;
            i--;
        }
        //判断最后一位是否需要进位
        if (plus == 1) sb.append(plus);
        //翻转后转字符串
        return sb.reverse().toString();
    }

}
