package Array.猜数字;

public class CaiShuZi {
    public int game(int[] guess, int[] answer) {
        int result = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                result += 1;
            }
        }
        return result;
    }
}
