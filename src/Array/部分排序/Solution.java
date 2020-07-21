package LinkList.部分排序;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/sub-sort-lcci/
     * 寻找逆序对
     * 从左到右 ，
     */
    public int[] subSort(int[] array) {
        if (array.length < 1) { return new int[] {-1,-1}; }
        int i = 0;
        int j = array.length - 1;
        int right = -1;
        int left = -1;
        int min = array[j--];
        int max = array[i++];
        for (; i < array.length ; i++ ,j-- ) {
            int leftV = array[i];
            int rightV = array[j];
            if (leftV < max) {  //从左向右遍历
                left = i;
            } else {
                max = leftV;
            }
            if (rightV > min) { //从右向左遍历
                right = j;
            } else {
                min = rightV;
            }
        }
        return new int[] {right,left};
    }


}
