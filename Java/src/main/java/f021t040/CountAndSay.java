package f021t040;

class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String pre = countAndSay(n - 1);
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for (int i = 0; i < pre.length(); ++i) {
            if (i + 1 == pre.length()
                || i + 1 != pre.length()
                && pre.charAt(i) != pre.charAt(i + 1)) {
                ans.append(count).append(pre.charAt(i));
                count = 0;
            }
            ++count;
        }
        return ans.toString();
    }
}
