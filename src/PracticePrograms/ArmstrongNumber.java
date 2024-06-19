package PracticePrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String n = read.next();
        int len = n.length();
        int num = Integer.parseInt(n);
        int digit, arm = 0, temp = num;

        while(temp > 0){
            digit = temp % 10;
            arm += (int) Math.pow(digit, len);
            temp /= 10;
        }

        System.out.println((arm == num) ? "It is a Armstrong Number" : "It is not a Armstrong Number");
    }
}
