package practiceJava;

import java.util.Scanner;

public class StringBufferPrac {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello what is your name?");
        String userInput = sc.nextLine();

        buffer.append(" java, Welcome to learn new language " + userInput);
        System.out.println(buffer);

        StringBuilder builder=new StringBuilder("hello");
        builder.append("java");
        System.out.println(builder);

        // Found out StringBuilder took less time (Performance wise use StringBuilder,
        // shorter time to loop through
    }
}

