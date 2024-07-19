package Calibraint;

import java.util.Scanner;

public class Array2D {

    public static void NinetyDegRotation(int[][] arr1, int n){

        int[][] arr2 = new int [n][n];
        int k = n-1;

        System.out.println("90° Rotated Array 👇");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                arr2[j][k] = arr1[i][j];
            }
            k--;
        }

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.print(arr2[i][j]);;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter Value of n: ");
        int n = read.nextInt();

        int[][] arr1 = new int [n][n];
        System.out.println("Enter " + n + " x " + n + " Matrix: ");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                arr1[i][j] = read.nextInt();
            }
            System.out.println();
        }

        System.out.println("Original Array 👇");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.print(arr1[i][j]);;
            }
            System.out.println();
        }
        NinetyDegRotation(arr1, n);
    }
}
