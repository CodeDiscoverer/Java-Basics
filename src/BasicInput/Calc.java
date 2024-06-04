package BasicInput;

import java.util.Scanner;

public class Calc {

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double a = read.nextDouble();
        double b = read.nextDouble();

        System.out.println("The Sum of " + a + " and " + b + " is " + sum(a, b));

        read.close();
    }
}

