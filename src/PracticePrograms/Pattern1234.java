/*
01 02 03 04 05
02 04 06 08 10
03 06 09 12 15
04 08 12 16 20
05 10 15 20 25
 */
package PracticePrograms;

import java.util.Scanner;

public class Pattern1234 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((i*j < 10) ? ("0"+ i*j + " ") : (i*j + " "));
            }
            System.out.println();
        }
    }
}
