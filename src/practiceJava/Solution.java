package practiceJava;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer to reverse");
        int userInput = Integer.parseInt(sc.next());

        int reversed = 0;
        int pop;

        while (userInput != 0) {
            pop = userInput % 10;
            userInput /= 10;

            reversed = (reversed * 10) + pop;
        }

    }
}