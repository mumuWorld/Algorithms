package Array.旋转数组的最小值;

import java.util.HashSet;

public class XuanZhuanShuZuDeZuiXiaoZhi {
    /**
     * https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
     */
    public int minArray(int[] numbers) {
        if (numbers == null) return 0;
        if (numbers.length == 1) return numbers[0];
        int i = numbers.length - 1;
        int j = i - 1;
        while (j >= 0) {
            int iV = numbers[i--];
            int jV = numbers[j--];
            if (jV > iV) {
                return iV;
            }
        }
        return numbers[0];
    }

    /**
     * https://leetcode-cn.com/problems/jewels-and-stones/comments/
     * @param J
     * @param S
     */
    public int numJewelsInStones(String J, String S) {
        HashSet set = new HashSet();
        for (char ch: J.toCharArray()) {
            set.add(ch);
        }
        int sum = 0;
        for (char ch: S.toCharArray()) {
            if (set.contains(ch)) {
                sum++;
            }
        }
        return sum;
    }

}
