package practiceJava;
import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        int a_length = a.length();
        int b_length = b.length();

        if (a_length != b_length) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] char_frequencies = new int[26];

        for (int i = 0; i < a_length; i++) {
            char current_char = a.charAt(i);
            int index = current_char - 'a';
            char_frequencies[index]++;
        }

        for (int j = 0; j < b_length; j++) {
            char current_char = b.charAt(j);
            int index = current_char - 'a';
            char_frequencies[index]--;
        }

        for (int i = 0; i < 26; i++) {
            if (char_frequencies[i] != 0) {
                return false;
            }
        }
        return true;

        // if (a_length != b_length) {
        //     return false;
        // }

        // a = a.toLowerCase();
        // b = b.toLowerCase();

        // char[] a_chars = a.toCharArray();
        // char[] b_chars = b.toCharArray();

        // Arrays.sort(a_chars);
        // Arrays.sort(b_chars);

        // return Arrays.equals(a_chars, b_chars);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

