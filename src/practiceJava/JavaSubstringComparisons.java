package practiceJava;
import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String current_Substring = s.substring(0, k);
        String smallest = current_Substring;
        String largest = current_Substring;

        for (int i = 1; i <= s.length() - k; i++) {
            current_Substring = s.substring(i, i+k);
            if ( current_Substring.compareTo(largest) > 0 ) {
                largest = current_Substring;
            }

            if ( current_Substring.compareTo(smallest) <0 ) {
                smallest = current_Substring;
            }
        }



        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
