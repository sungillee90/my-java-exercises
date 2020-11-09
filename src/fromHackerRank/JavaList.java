package fromHackerRank;
import java.io.*;
import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> li = new ArrayList();

        for (int i = 0; i < n; i++) {
            li.add(sc.nextInt());
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++){
            String query = sc.next();
            int x = sc.nextInt();

            if(query.equals("Insert")) {
                int y = sc.nextInt();
                li.add(x,y);
            } else {
                li.remove(x);
            }
        }
        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");
        }
    }
}
