package practice;

import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        float height;
        int weight;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in meter: ");
        height = Float.parseFloat(sc.nextLine());
        System.out.println("Enter your weight in kg: ");
        weight= Integer.parseInt(sc.nextLine());
        float calcBMI = weight / (height * height);
        float BMI = (float) (Math.round(calcBMI *100)/100.0);
        System.out.println("Your BMI is = " + BMI);

        int result = 81%10;
        System.out.println("result = " + result);
    }
}
