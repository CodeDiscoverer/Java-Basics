package Collections;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Elements to store in List: ");
        int n = read.nextInt();

        List <Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(read.nextInt());
        }

        System.out.println("List Printing: " + list);
        System.out.println("List Printing using toString: " + Arrays.toString(list.toArray()));

        Collections.rotate(list, 4);

        System.out.println("List Printing: " + list);
        System.out.println("List Printing using toString: " + Arrays.toString(list.toArray()));
    }
}
