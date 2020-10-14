package practice;

public class DecodeWaysTrial1 {
    public static void main(String[] args) {
        DecodeWaysTrial1 run = new DecodeWaysTrial1();

        run.numDecodings("123");
    }
    public int numDecodings(String s) {
        if (s.length() < 1) {
            return 0;
        }
        if (s[0] == "0") {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        int val1 = 1;
        int val2 = 1;

        for (int i = 0; i < s.length; i++) {
            int d1 = s[i] - '0';
            int d2 = (s[i - 1] - '0') * 10 + d1;
            int val = 0;

            if (d1 >= 1) {
                val += val2;
            }
            if (d2 >= 10 && d2 <= 26) {
                val += val1;
            }

            val1 = val2;
            val2 = val;
        }
        return val2;
    }
}
