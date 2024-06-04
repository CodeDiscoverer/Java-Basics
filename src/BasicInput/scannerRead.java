package BasicInput;

import java.util.Scanner;

public class scannerRead {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int x = read.nextInt();
        double y = read.nextDouble();
        read.nextLine();
        String z = read.nextLine();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
