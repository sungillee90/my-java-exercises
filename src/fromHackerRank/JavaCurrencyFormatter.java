package fromHackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the double number = ");
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(payment));
//        NumberFormat.getCurrencyInstance(Locale.);
        String usP = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String indP = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String ChiP = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String FrenP = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + usP);
        System.out.println("India: " + indP);
        System.out.println("China: " + ChiP);
        System.out.println("France: " + FrenP);
    }
}
