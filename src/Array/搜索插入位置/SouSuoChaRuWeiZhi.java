package Array.搜索插入位置;

public class SouSuoChaRuWeiZhi {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        //最后肯定target小，所以放到最后。
        return nums.length;
    }
}
