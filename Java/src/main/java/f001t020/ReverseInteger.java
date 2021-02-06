package f001t020;

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int temp = result;
            result = result*10 + x%10;
            x /= 10;
            if (result/10 != temp) {
                return 0;
            }
        }
        return result;
    }
}
