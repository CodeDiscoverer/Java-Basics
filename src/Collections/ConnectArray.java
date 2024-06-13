package Collections;

import java.util.Scanner;

public class ConnectArray {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter the count: ");
        int n = read.nextInt();
        int [] arr = new int[n];
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];

        System.out.println("Enter First " + n + " Elements: ");
        for(int i=0; i<n; i++){
            arr1[i] = read.nextInt();
        }

        System.out.println("Enter Second " + n + " Elements: ");
        for(int i=0; i<n; i++){
            arr2[i] = read.nextInt();
        }

        System.out.print("The Wave Array is: ");
        for(int i=0, j=(n)-1; i<n; i++){
            System.out.print(arr1[i] + " " + arr2[j] +" ");
            j--;
        }
    }
}
