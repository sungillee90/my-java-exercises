package practiceJava;
import java.util.*;

public class JavaBitSet {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet bs1 = new BitSet(n);
        BitSet bs2 = new BitSet(m);

        for (int i = 0; i < m; i++) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            switch(op) {
                case "AND":
                    if (x == 1) {
                        bs1.and(bs2);
                    } else {
                        bs2.and(bs1);
                    }
                    break;
                case "OR":
                    if (x == 1) {
                        bs1.or(bs2);
                    } else {
                        bs2.or(bs1);
                    }
                    break;
                case "FLIP":
                    if (x == 1) {
                        bs1.flip(y);
                    } else {
                        bs2.flip(y);
                    }
                    break;
                case "SET":
                    if (x == 1) {
                        bs1.set(y);
                    } else {
                        bs2.set(y);
                    }
                    break;
                case "XOR":
                    if (x == 1) {
                        bs1.xor(bs2);
                    } else {
                        bs2.xor(bs1);
                    }
                    break;
            }
            System.out.println(bs1.cardinality() + " " + bs2.cardinality());
        }
        sc.close();
    }
}

