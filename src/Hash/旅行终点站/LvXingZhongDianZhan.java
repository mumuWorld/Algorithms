package Hash.旅行终点站;

import com.sun.tools.javac.util.List;

import java.util.HashMap;

public class LvXingZhongDianZhan {
    /** https://leetcode-cn.com/problems/destination-city/
     *  哈希算法 ，如果一个终点不是任何一个站的起点，就是最终的终点。
     */
    public String destCity(List<List<String>> paths) {
        if (paths == null) return null;
        HashMap<String, String> map = new HashMap<>();
        for (List<String> sub: paths) {
            map.put(sub.get(0), sub.get(1));
        }
        for (String key: map.values()) {
            if (map.get(key) == null) {
                return key;
            }
        }
        return null;
    }
}
