package fromHackerRank;
import java.util.Arrays;
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

        char[] a_chars = a.toCharArray();
        char[] b_chars = b.toCharArray();

        Arrays.sort(a_chars);
        Arrays.sort(b_chars);

        if (a_chars.equals((b_chars)) return true;
        else return false;

        int[] char_freq = new int[26];
        for (int i=0; i<a_length; i++) {
            char current_char = a.charAt(i);
            int index = current_char - 'a';
            char_freq[index]++;
        }

        for (int i=0; i<b_length; i++) {
            char current_char = a.charAt(i);
            int index = current_char - 'a';
            char_freq[index]--;
        }

        for (int i=0; i<26; i++) {
            if (char_freq[i] != 0) {
                return false;
            }
        }
        return true;
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
