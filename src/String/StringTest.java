package String;

public class StringTest {

    int findMax(String a, String b) {
        if (a.length() < 1 || b.length() < 1) return 0;
        int maxLength = 0;
        int iA = 0;
        int iB = 0;

        for (int i = 0; i < a.length(); i++ ) {
            int tmpMax = 0;
            iA = i;
            iB = 0;
            while (iA < a.length() && iB < b.length() && a.charAt(iA) == b.charAt(iB)) {
                iA++;
                iB++;
                tmpMax++;
            }
            Math.max(maxLength, tmpMax);
        }
        return  maxLength;
    }
}
