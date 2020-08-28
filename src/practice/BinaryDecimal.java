package practice;

import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a int number to convert to Binary");
        int userInputInt = Integer.parseInt(sc.nextLine());

        String s = Integer.toBinaryString(userInputInt);
        System.out.println("To Binary = " + s);

        s = new StringBuilder(s).reverse().toString();
        System.out.println("To reverse the output = " + s);
    }
}
