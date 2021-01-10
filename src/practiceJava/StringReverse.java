package practiceJava;
import java.util.*;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

//        // reverse version of A
//        String B = new StringBuilder(A).reverse().toString();
//
//        if (A.equals(B)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

        // Refactor one
        int a_Pointer = 0;
        int b_Pointer = A.length() - 1;

        while (a_Pointer <= b_Pointer) {
            if (A.charAt(a_Pointer) != A.charAt(b_Pointer)) {
                System.out.println("No");
                return;
            }

            a_Pointer++;
            b_Pointer--;
        }
        System.out.println("Yes");
    }
}
