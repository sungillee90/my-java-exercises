package fromHackerRank;
import java.io.*;
import java.util.*;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        // reverse version of A
        String B = new StringBuilder(A).reverse().toString();

        if (A.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
