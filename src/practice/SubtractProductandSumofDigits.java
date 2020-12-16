package practice;

public class SubtractProductandSumofDigits {
    int digitsManipulations(int n) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the positive integer number: ");
        // int userInputNum = sc.next();
        // parse the userInput to single digit.

        // initialize the variables
        int product = 1;
        int sum = 0;
        int curr = n;

        while (curr > 0) {
            int now = curr % 10;
            sum = (sum + now);
            product = (product * now);
            curr = (curr / 10);
        }

        return (product - sum);

    }
}
