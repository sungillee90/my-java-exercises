package Practice;


import java.util.Scanner;

public class TwoSum {

    static int solveMeFirst(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println("The total sum of the integer is : " + sum);
    }

}
