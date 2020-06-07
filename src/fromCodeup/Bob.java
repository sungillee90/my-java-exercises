package fromCodeup;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What will you say to fromCodeup.Bob?");
        String userInput = sc.nextLine();

        if (userInput.endsWith("?")) {
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine, be that way!");
        } else {
            System.out.println("Whatever!");
        }
    }
}
