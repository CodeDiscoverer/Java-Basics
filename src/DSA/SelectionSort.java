package DSA;

import java.util.Scanner;

public class SelectionSort {
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
        for(int i = 0; i < n; i++) {
            // Code For ASC
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


        System.out.print("Descending Sort 👉 ");
        for(int i = 0; i < n; i++) {
            // Code DESC
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
