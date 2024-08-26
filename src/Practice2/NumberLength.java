package Practice2;

import java.util.Scanner;

public class NumberLength {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = read.nextInt();
        int length = 0;

        while(n>0){
            n /= 10;
            length++;
        }

        System.out.println(length);
    }
}
