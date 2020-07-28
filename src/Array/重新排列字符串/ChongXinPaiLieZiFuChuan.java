package Array.重新排列字符串;

public class ChongXinPaiLieZiFuChuan {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            ch[indices[i]] = s.charAt(i);
        }
        return new String(ch);
    }
}
