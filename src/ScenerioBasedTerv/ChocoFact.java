package ScenerioBasedTerv;

import java.util.Scanner;

public class ChocoFact {
    public static void main(String[] args) {
        long n, c = 0;
        long a = 1, b = 1;
        Scanner s = new Scanner(System.in);
        n = s.nextLong();
        for(int i = 1; i < n; ++i) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.print(c);
    }
}
