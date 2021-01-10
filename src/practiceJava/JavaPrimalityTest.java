package practiceJava;
import java.math.*;
import java.util.*;

public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger bi = new BigInteger(scanner.next());

        scanner.close();
        System.out.println(bi.isProbablePrime(10) ? "prime" : "not prime");
    }
}
