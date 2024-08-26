package Practice2;

import java.util.Scanner;

public class NumberLengthO1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String n = read.next();
        int length = n.length();

        System.out.println(length);
    }
}
