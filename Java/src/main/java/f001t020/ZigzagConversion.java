package f001t020;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] buffer = new StringBuilder[numRows];
        for (int i = 0; i < numRows; ++i) {
            buffer[i] = new StringBuilder("");
        }
        int n = 0;
        boolean direction = true;
        for (int i = 0; i < s.length(); ++i) {
            buffer[n].append(s.charAt(i));
            if (direction) {
                ++n;
            } else {
                --n;
            }
            if (n == 0 || n == numRows-1) {
                direction = !direction;
            }
        }
        for (int i = 1; i < numRows; ++i) {
            buffer[0].append(buffer[i].toString());
        }
        return buffer[0].toString();
    }
}
