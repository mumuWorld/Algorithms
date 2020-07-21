package Array.拥有最多糖果的孩子;

import java.util.ArrayList;
import java.util.List;

public class YongYouZuiDuoTangGuoDeHaiZi {
    /**
     * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
     * 两次遍历
     * 1 找出最大的，
     * 2 计算cur + extra >= max
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList();
        if (candies == null || candies.length == 0) return list;
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(candies[i],max);
        }
        for (int i = 0; i < candies.length; i++) {
            list.add((candies[i] + extraCandies) >= max);
        }
        return list;
    }
}
