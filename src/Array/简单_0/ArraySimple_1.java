package Array.简单_0;

import java.util.List;

public class ArraySimple_1 {
    /**
     * 1672. 最富有客户的资产总量
     * https://leetcode-cn.com/problems/richest-customer-wealth/
     * @param accounts
     * @return
     */
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i = 0; i < accounts.length; i++) {
            int tmp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                tmp += accounts[i][j];
            }
            result = Math.max(tmp, result);
        }
        return result;
    }

    /**
     * 1773. 统计匹配检索规则的物品数量
     * https://leetcode-cn.com/problems/count-items-matching-a-rule/
     * @param items
     * @param ruleKey
     * @param ruleValue
     * @return
     */
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int type = 0;
        if (ruleKey.equals("type")) {
        } else if (ruleKey.equals("color")) {
            type = 1;
        } else if (ruleKey.equals("name")) {
            type = 2;
        }
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(type).equals(ruleValue)) {
                count += 1;
            }
        }
        return count;
    }
}
