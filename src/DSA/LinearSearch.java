package DSA;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter the count: ");
        int n = read.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter " + n + " Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = read.nextInt();
        }

        System.out.print("Enter Number to Search: ");
        int target = read.nextInt();

        for(int val:arr){
            System.out.print((val == target) ? " Yes " : "No");
        }
    }
}
