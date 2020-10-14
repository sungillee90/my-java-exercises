package practice;

public class DecodeWaysTrial1 {
    public static void main(String[] args) {
        DecodeWaysTrial1 run = new DecodeWaysTrial1();

        run.numDecodings("123");
    }
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;

        if (s.charAt(0) != '0'){
            dp[1] = 1;
        }
        for(int i = 2; i <= s.length(); i++){
            int firstcut = Integer.valueOf(s.substring(i-1, i));
            int secondcut = Integer.valueOf(s.substring(i-2, i));

            if (firstcut > 0 ){
                dp[i] = dp[i-1];
            }
            if (secondcut >= 10 && secondcut <= 26){
                dp[i] = dp[i-2];
            }
        }
        return dp[s.length()];
    }
    //        if (s.length() < 1) {
//            return 0;
//        }
//        if (s[0] == "0") {
//            return 0;
//        }
//        if (s.length() == 1) {
//            return 1;
//        }
//
//        int val1 = 1;
//        int val2 = 1;
//
//        for (int i = 0; i < s.length; i++) {
//            int d1 = s[i] - '0';
//            int d2 = (s[i - 1] - '0') * 10 + d1;
//            int val = 0;
//
//            if (d1 >= 1) {
//                val += val2;
//            }
//            if (d2 >= 10 && d2 <= 26) {
//                val += val1;
//            }
//
//            val1 = val2;
//            val2 = val;
//        }
//        return val2;
    }
}
