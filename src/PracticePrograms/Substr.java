package PracticePrograms;

import java.util.Scanner;

public class Substr {

    public static void solve(String s1, String s2) {

        boolean flag = s1.contains(s2);

        System.out.println((flag) ? (s2 + " is present in the string.") : (s2 + " is not present in the string."));
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String str1 = read.nextLine();
        String str2 = read.nextLine();

        solve(str1, str2);
    }
}