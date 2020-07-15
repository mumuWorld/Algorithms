package 一些资料加密;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5加密 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String s = "仙石";// 5
        MessageDigest md = MessageDigest.getInstance("MD5");


        for (int i = 0; i < 100000000; i++) {
            byte[] sBytes = s.getBytes();
            byte[] digest = md.digest(sBytes);

            // 十六进制的字符
            char[] chars = new char[]{'0', '1', '2', '3', '4', '5',
                    '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            StringBuffer sb = new StringBuffer();
            // 处理成十六进制的字符串(通常)
            for (byte bb : digest) {
                sb.append(chars[(bb >> 4) & 15]);
                sb.append(chars[bb & 15]);
            }
            s = sb.toString();
        }
        //答案: 432b82f7dd5791526fe3395a8463dd07
        System.out.println(s);
    }
}
