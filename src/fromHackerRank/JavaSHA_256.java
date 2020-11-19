package fromHackerRank;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA_256 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(getSHAHEX(s));
        sc.close();
    }
    public static String getSHAHEX(String s) {
        StringBuffer sb = new StringBuffer();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] result = md.digest(s.getBytes());
            for (int i = 0; i < result.length; i++) {
                String hex = Integer.toHexString(0xff & result[i]);
                if (hex.length()==1) {
                    sb.append('0');
                    sb.append(hex);
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
