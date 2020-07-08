
import DataStructure.ListNode;
import Stack_Queue.每日温度.*;
import String.翻转字符串里的单词.FanZhuanZiFuChuanLiDeDanCi;

public class Test {
    @org.junit.Test
    public void main() {
      /*  MeiRiWenDu o = new MeiRiWenDu();
                int[] test = {73,74,75,71,69,72,76,73};
        o.dailyTemperatures(test);*/
        FanZhuanZiFuChuanLiDeDanCi o = new FanZhuanZiFuChuanLiDeDanCi();
        String result = o.reverseWords("test  he");
        String result2 = o.reverseWords("  hig  he  abc");
        String result3 = o.reverseWords("the sky is blue");

        System.out.println("aa__" + result + "__aa");
        System.out.println("aa__" + result2 + "__aa");
        System.out.println("aa__" + result3 + "__aa");
    }
}
