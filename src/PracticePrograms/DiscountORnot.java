/*
Code Chef Problem Discount or Not
 */
package PracticePrograms;

import java.util.Scanner;

public class DiscountORnot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];
            int originalCost = 0;
            int discountCost = x;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                originalCost += a[i];

                if (a[i] > y) {
                    discountCost += (a[i] - y);
                }
            }
            System.out.println((originalCost <= discountCost) ? "NO COUPON" : "COUPON");
        }
    }
}