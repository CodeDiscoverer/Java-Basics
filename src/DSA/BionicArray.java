// Biotonic Array Input: A = {5, 6, 7, 8, 9, 10, 3, 2, 1} Output: Biotonic Element is 10
package DSA;

import java.util.*;

public class BionicArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.print("Enter Value of n: ");
        int n = read.nextInt();

        System.out.println("Enter " + n + " Values into Array List: ");
        for (int i = 0; i < n; i++) {
            list.add(read.nextInt());
        }

        int peak = findPeakElement(list);
        System.out.println("The Biotonic Element is " + peak);
    }

    public static int findPeakElement(List<Integer> list) {
        int l = 0, r = list.size() - 1;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (list.get(m) > list.get(m + 1)) {
                r = m;
            }
            else {
                l = m + 1;
            }
        }
        return list.get(l);
    }
}
