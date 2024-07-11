package Oops;

class MathUtils {

    public static int square(int num) {
        return num * num;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
}

public class SqAndFact {
    public static void main(String[] args) {

        int squaredValue = MathUtils.square(5);
        System.out.println("Square of 5 is: " + squaredValue);

        int factorialValue = MathUtils.factorial(5);
        System.out.println("Factorial of 5 is: " + factorialValue);
    }
}
