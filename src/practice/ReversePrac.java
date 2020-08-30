package practice;

import java.util.Scanner;

public class ReversePrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String userInput = sc.nextLine();

        StringBuilder reverseInputSC1 = new StringBuilder();
        // char[] => array
        //  String[] words = new String[words.length()]
        // type[]
        String[] words = userInput.split(" ");

        for (String word : words) {
            String reverseWord = new StringBuilder(word).reverse().toString();
            reverseInputSC1.append(reverseWord + " "); }

        System.out.println(reverseInputSC1.toString().trim());
    }
}
