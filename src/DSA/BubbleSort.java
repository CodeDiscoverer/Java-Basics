package DSA;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter the count: ");
        int n = read.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter " + n + " Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = read.nextInt();
        }

        System.out.print("Ascending Sort 👉 ");
        int count = 0, count1 = 0;
        for(int i = 0; i < n; i++) {
            count++;
            for(int j = i + 1; j < n - 1 - i; j++) {
                count1++;
                if(arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] -= arr[j + 1];
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + count + " " + count1);

        System.out.print("Descending Sort 👉 ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if(arr[j] < arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] -= arr[j + 1];
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
