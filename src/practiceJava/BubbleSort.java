package practiceJava;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n is the size of the array
        int n = sc.nextInt();
        int arr[] = new int[n];

        // grabbing the array index
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int countSwap = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                    countSwap++;
                }
            }
        }
        System.out.println("Array is sorted in " + countSwap + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[n-1]);

    }
}
