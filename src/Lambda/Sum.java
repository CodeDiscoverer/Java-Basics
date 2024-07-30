package Lambda;

@FunctionalInterface
interface SumOperation {
    int sum(int a, int b);
}

public class Sum {
    public static void main(String[] args) {

        SumOperation s = (a, b) -> a + b;

        System.out.println("The sum is: " + s.sum(10, 20));
    }
}
