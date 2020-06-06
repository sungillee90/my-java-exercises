package fromCodeup;

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

}