package DataStructure;

public class ArrayTools {
    public static void exchange(int[] nums, int a, int b) {
        if (a == b) {
            return;
        }
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
