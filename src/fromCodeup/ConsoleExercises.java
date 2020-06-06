package fromCodeup;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately 3.14.");
        System.out.printf("The value of pi is approximately %.3f\n", pi);

        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a Number");
        int userInput = Integer.parseInt(sc.nextLine());
        System.out.println("userInput = " + userInput);

        String param1 = sc.nextLine();
        String param2 = sc.nextLine();
        String param3 = sc.nextLine();
        System.out.println("param1: " + param1);
        System.out.println("param2: " + param2);
        System.out.println("param3: " + param3);

        System.out.println("Give me the length: ");
        float length = Float.parseFloat(sc.nextLine().);
        System.out.println("Give me the width: ");
        float width = Float.parseFloat(sc.nextLine());

        float area = width * length;
        float perimeter = (width * 2) + (length * 2);

        System.out.println("area = " + area);
        System.out.println("perimeter= " + perimeter);

        System.out.printf("Enter values of length and width of Apex's class: ");
        double userInputLenWidth = sc.nextDouble();
        System.out.println("You entered: --> \"" + userInputLenWidth + "\" <--");
        double areaApex = userInputLenWidth * userInputLenWidth;
        System.out.println("The size of your classroom is =  \"" + areaApex + "\" units Square");
        double perimeterApex = userInputLenWidth * 4;
        System.out.println("The perimeter of your classroom is =  \"" + perimeterApex + "\" units");
        double volumeApex = userInputLenWidth * userInputLenWidth * userInputLenWidth;
        System.out.println("The perimeter of your classroom is =  \"" + volumeApex + "\" cubiric units");

    }
}
