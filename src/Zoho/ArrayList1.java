package Zoho;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        List <Integer> list = new ArrayList<>();

        System.out.print("Enter Value of n: ");
        int n = read.nextInt();

        System.out.print("Enter Value of x: ");
        int x = read.nextInt();

        System.out.print("Enter Value of y: ");
        int y = read.nextInt();

        System.out.println("Enter " + n + " Values into Array List: ");
        for(int i=0; i<n; i++){
            list.add(read.nextInt());
        }

        //Collections.sort(list);

        System.out.print("The Output is 👉");
        for(int k :list){
            System.out.print((k>x && k<y) ? k + " " : "");
        }
    }
}
