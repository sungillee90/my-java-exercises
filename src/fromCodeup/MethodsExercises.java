package fromCodeup;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        addition(1, 2);
        System.out.println(addition(1, 2));

        subtraction(5,2);
        System.out.println(subtraction(5,2));

        multiplication(3,5);
        System.out.println(multiplication(3,5));

        division(10,2);
        System.out.println(division(10,0));

        modulus(5,2);
        System.out.println(modulus(5,2));

        System.out.println(getInteger(1, 10));
        System.out.println(getInteger(6,8));
//        getFactorial();
    }

    public static int addition (int i, int j) {
        return i + j;
    }

    public static int subtraction (int a, int b) {
        return a - b;
    }

    public static int multiplication (int c, int d) {
        return c * d;
    }

    public static float division (float a, float b) {
        if (b == 0) {
            System.out.println( "undefined, division by zero is NOT possible, 0 is returned.");
            return 0;
        }
        return a / b;
    }

    public static double modulus (double a, double b) {
        return a % b;
    }

    public static int getInteger (int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = Integer.parseInt(sc.nextLine());

        if (userInput < min || userInput > max) {
            System.out.println("Number is outside of the range.");
            return getInteger(min, max); // recursion
        } else {
            System.out.println("Good! It is within the range.");
            return userInput;
        }
    }

//    public static void getFactorial() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer number between 1 and 10: ");
//        int userInput = Integer.parseInt(sc.nextLine());
//        System.out.println("You entered " + userInput + ".");
//        long sum = 1L;
//        for (int i = userInput; i > 0; i--) {
//            sum *= i;
//        }
//        System.out.println("Factorial of you entered is = " + sum);
//    }
}