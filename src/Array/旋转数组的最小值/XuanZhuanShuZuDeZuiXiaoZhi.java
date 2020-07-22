package Array.旋转数组的最小值;

public class XuanZhuanShuZuDeZuiXiaoZhi {
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
}
