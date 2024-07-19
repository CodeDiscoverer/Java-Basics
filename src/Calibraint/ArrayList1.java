package Calibraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ProductOfFirstSecondLargestValue{

    private final List<Integer> list;

    ProductOfFirstSecondLargestValue(List<Integer> list) {
        this.list = list;
    }

    public int Solve(){
        System.out.println(list);
        int firstLargestElement = Collections.max(list);
        list.remove(Integer.valueOf(firstLargestElement));
        int secondLargestElement = Collections.max(list);

        return firstLargestElement * secondLargestElement;
    }
}
public class ArrayList1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.print("Enter Value of n: ");
        int n = read.nextInt();
        System.out.println("Enter " + n + " Values into Array List: ");
        for (int i = 0; i < n; i++) {
            list.add(read.nextInt());
        }

        ProductOfFirstSecondLargestValue PFSL = new ProductOfFirstSecondLargestValue(list);

        System.out.println((list.size() <= 2) ? (list.getFirst() * list.getLast()) : PFSL.Solve());
    }
}
