package Collections;

import java.util.*;

public class LRCache {
    private static final Deque<Integer> cache = new LinkedList<>();
    private static final int MAX = 4;

    public static void addElement(int element) {

        if (cache.contains(element)) {
            cache.remove(element);
        } else if (cache.size() >= MAX) {
            cache.removeLast();
        }
        cache.addFirst(element);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("1. Add Element\n2. Display Queue\n0. Exit\n");
        int choice;

        do {
            System.out.print("Enter Your Choice: ");
            choice = read.nextInt();

            switch (choice) {
                case 0:
                    System.err.println("Exiting...");
                    break;
                case 1:
                    System.out.print("Enter element to add: ");
                    int element = read.nextInt();
                    addElement(element);
                    break;
                case 2:
                    System.out.println(cache);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);

        read.close();
    }
}
