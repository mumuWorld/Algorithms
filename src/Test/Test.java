import Array.螺旋矩阵.LuoXuanJuZhen;
import DataStructure.ListNode;
import DataStructure.TreeNode;
import DynamicProgramming.不同的二叉搜索树.BuTongDeBSTTree;
import Hash.两数之和2.LiangShuZhiHe2;
import Other.Pow.PowXY;
import Stack_Queue.有效括号.YouXiaoKuoHao;
import Stack_Queue.每日温度.*;
import String.最长公共子序列.ZuiChangGongGongZiXuLie;
import String.最长回文子串.ZuiChangHuiWenZiChuan;
import String.翻转字符串里的单词.FanZhuanZiFuChuanLiDeDanCi;
import Tree.最小高度树.ZuiXiaoGaoDuShu;
import 一些资料加密.MD5加密;

import java.util.List;

public class Test {
    @org.junit.Test
    public void main() {
      /*  MeiRiWenDu o = new MeiRiWenDu();
                int[] test = {73,74,75,71,69,72,76,73};
        o.dailyTemperatures(test);*/
//        FanZhuanZiFuChuanLiDeDanCi o = new FanZhuanZiFuChuanLiDeDanCi();
//        String result = o.reverseWords("test  he");
//        String result2 = o.reverseWords("  hig  he  abc");
//        String result3 = o.reverseWords("the sky is blue");
//
//        System.out.println("aa__" + result + "__aa");
//        System.out.println("aa__" + result2 + "__aa");
//        System.out.println("aa__" + result3 + "__aa");

//        ZuiChangHuiWenZiChuan o = new ZuiChangHuiWenZiChuan();
//        String result = o.longestPalindrome_2("cbbd");
//        System.out.println("aa__" + result + "__aa");
//        YouXiaoKuoHao youXiaoKuoHao = new YouXiaoKuoHao();
//        youXiaoKuoHao.isValid("()[]{}");
//        BuTongDeBSTTree buTongDeBSTTree = new BuTongDeBSTTree();
//        int result = buTongDeBSTTree.numTrees(3);
//        System.out.println("aa__" + result + "__aa");
//        PowXY powXY = new PowXY();

//        LiangShuZhiHe2 liangShuZhiHe2 = new LiangShuZhiHe2();
//        int[] result = liangShuZhiHe2.twoSum(new int[]{2,7,11,15},9);
//        ZuiXiaoGaoDuShu o = new ZuiXiaoGaoDuShu();
//        TreeNode node = o.sortedArrayToBST(new int[]{-10,-3,0,5,9});
//        System.out.println("aa__" + node.Postorderraversal().toString() + "__aa");
//
//        LuoXuanJuZhen luoXuanJuZhen = new LuoXuanJuZhen();
//        List result = luoXuanJuZhen.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

        ZuiChangGongGongZiXuLie text = new ZuiChangGongGongZiXuLie();
        int result = text.longestCommonSubsequence("abcde","ace");
        System.out.println(result);
    }
}
