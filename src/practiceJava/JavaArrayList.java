package practiceJava;
import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList[] al = new ArrayList[20000];
        Scanner sc = new Scanner(System.in);

        int lists = sc.nextInt();

        for (int i = 0; i < lists; i++) {
            al[i] = new ArrayList();
            int num = sc.nextInt();
            for (int j = 0; j <num; j++) {
                int val = sc.nextInt();
                al[i].add(val);
            }
        }

        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(al[x-1].get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}

