package Array;

public class 合并两个有序数组 {
    /** https://leetcode-cn.com/problems/sorted-merge-lcci/
     * 面试题 10.01. 合并排序的数组  A.length = m + n;
     * 倒序遍历
     */
    public void merge(int[] A, int m, int[] B, int n) {
        int ia = m - 1;
        int ib = n - 1;
        int cur = m + n  - 1;
        while (ia > -1 || ib > -1) {
            if (ia == -1) { //判断 a是否已经遍历完
                A[cur--] = B[ib--];
            } else if (ib == -1) { //判断 b是否已经遍历完
                A[cur--] = A[ia--];
            } else if (A[ia] < B[ib]) { // 比较大小
                A[cur--] = B[ib--];
            } else {
                A[cur--] = A[ia--];
            }
        }
    }
}
