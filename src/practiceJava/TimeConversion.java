package practiceJava;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {


    static String timeConversion(String s) {
        String str = "";
        if (!s.substring(0,2).equals("12") && s.contains("PM")) {
            str = Integer.toString(Integer.parseInt(s.substring(0,2)) + 12);
            s = str + s.substring(2,s.length());
        }
        if (s.substring(0,2).equals("12") && s.contains("AM")) {
            str = "00";
            s = str + s.substring(2,s.length());
        }
        return s.substring(0, s.length() - 2);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}