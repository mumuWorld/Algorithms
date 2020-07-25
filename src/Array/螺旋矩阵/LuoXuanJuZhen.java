package Array.螺旋矩阵;

import java.util.ArrayList;
import java.util.List;

public class LuoXuanJuZhen {
    /** https://leetcode-cn.com/problems/spiral-matrix/
     *  等价于 先加外面一圈， 再加里面的圈。
     *  上下左右 四个指针判断。
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return list;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top > bottom || left > right) {
                break;
            }
            for (int i = right; i >= left ; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list;
    }
}
