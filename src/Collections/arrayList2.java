package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrayList2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Elements to store in List: ");
        int n = read.nextInt();

        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(read.next());
        }

        System.out.print("Enter the value to search the Index: ");
        String searchValue = read.next();

        System.out.print("Enter the Index: ");
        int searchIndex = read.nextInt();

        System.out.println("List Printing: " + list);
        System.out.println("List Printing using toString: " + Arrays.toString(list.toArray()));
        System.out.println("The Element is available: " +list.contains(searchValue));
        System.out.println("The Element index: " +list.indexOf(searchValue));
        System.out.println("The Element Last index: " +list.lastIndexOf(searchValue));
        System.out.println("The Size of the List is " + list.size());
        System.out.println("The value in the given index: " +list.get(searchIndex));
        System.out.println("The hashcode of the list: " +list.hashCode());
        System.out.println("The Element is removed in the given Index: " +list.remove(searchIndex));
        System.out.println("The list1 is added to list2: " +list1.addAll(list));
        System.out.println("The first value: " + list1.getFirst());
        System.out.println("The last value: " + list1.getLast());
        System.out.println("Sub List Index (1-3): " +list1.subList(1, 3));
        System.out.println(list1.removeFirst());
        System.out.println(list1);
        System.out.println(list1.removeLast());
        System.out.println(list1);
        System.out.println(list1.removeAll(list));
        System.out.println(list1.isEmpty());
    }
}
