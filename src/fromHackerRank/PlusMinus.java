package fromHackerRank;

import java.util.Scanner;

public class PlusMinus {

    static void PlusMinus(int[] arr) {

        int len=arr.length;
        float posCount = 0;
        float negaCount = 0;
        float zeroCount = 0;

        for(int i = 0; i<len; i++) {
            int element = arr[i];
            if(element > 0){
                posCount++;
            }
            if(element < 0){
                negaCount++;
            }
            if(element == 0){
                zeroCount++;
            }
        }

        System.out.printf("%1.6f \n", posCount / len);
        System.out.printf("%1.6f \n", negaCount / len);
        System.out.printf("%1.6f \n", zeroCount / len);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        PlusMinus(arr);

        scanner.close();
    }
}