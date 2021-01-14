package practiceJava;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long total_fullString = n / s.length();
        long rem = n % s.length();

        char[] c = s.toCharArray();
        long count = 0;
        for (int i = 0; i < s.length(); i ++) {
            if (c[i] == 'a') {
                count++;
            }
        }

        count *= total_fullString;

        for (int i = 0; i < rem; i++) {
            if (c[i] == 'a') {
                count++;
            }
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

