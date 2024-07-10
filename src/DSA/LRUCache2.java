package DSA;

import java.util.*;

public class LRUCache2 {
    private static final Deque<Integer> cache = new LinkedList<>();
    private static final Map<Integer, String> map = new HashMap<>();
    private static final int MAX = 4;

    public static void addElement(int key, String value) {
        if (map.containsKey(key)) {
            cache.remove(key);
        }
        else if (cache.size() >= MAX) {
            int removedKey = cache.removeLast();
            map.remove(removedKey);
        }

        cache.addFirst(key);
        map.put(key, value);
    }


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("1. Add Element\n2. Display Queue\n0. Exit");
        int choice;

        do {
            System.out.print("\nEnter Your Choice: ");
            choice = read.nextInt();

            switch (choice) {
                case 0:
                    System.err.println("Exiting...");
                    break;
                case 1:
                    System.out.print("Enter key: ");
                    int key = read.nextInt();
                    read.nextLine();
                    System.out.print("Enter value: ");
                    String value = read.nextLine();
                    addElement(key, value);
                    break;
                case 2:
                    System.out.println("Cache (Keys): " + cache);
                    System.out.println("Values: " + map.values());
                    break;
                default:
                    System.err.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);

        read.close();
    }
}
