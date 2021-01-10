package practiceJava;
import java.util.*;

public class JavaSubarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        //int negative_subarray;
        int negative_subarray = 0;

        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                int current_sum = 0;
                // int negative_subarray = 0;
                for(int k=i; k<=j; k++) {
                    current_sum += arr[k];
                }

                if (current_sum < 0) {
                    negative_subarray++;
                }
            }
        }
        System.out.println(negative_subarray);
    }
}

