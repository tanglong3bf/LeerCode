package f001t020;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int cursor1 = 0;
        if (0 == Math.min(strs[0].length(), strs[1].length())) return "";
        while (strs[0].charAt(cursor1) == strs[1].charAt(cursor1)) {
            ++cursor1;
            if (cursor1 == Math.min(strs[0].length(), strs[1].length()))
                break;
        }
        if (strs.length == 2)
            return strs[0].substring(0, cursor1);
        for (int i = 2; i < strs.length; ++i)
            for (int cursor2 = 0; cursor2 <= cursor1; ++cursor2) {
                if (cursor2 == Math.min(strs[0].length(),strs[i].length())) {
                    cursor1 = cursor2;
                    break;
                }
                if (strs[i].charAt(cursor2) != strs[0].charAt(cursor2)) {
                    cursor1 = cursor2;
                    break;
                }
            }
        return strs[0].substring(0, cursor1);
    }
}
