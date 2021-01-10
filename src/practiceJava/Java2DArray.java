package practiceJava;
import java.util.*;

public class Java2DArray {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();


        int max_hourglass_sum = -63;

        for (int i=0; i<=3; i++) {
            for (int j=0; j<=3; j++){
                int current_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (current_sum > max_hourglass_sum) {
                    max_hourglass_sum = current_sum;
                }
            }
        }

        System.out.println(max_hourglass_sum);
    }
}


