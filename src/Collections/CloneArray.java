package Collections;

import java.util.*;

public class CloneArray {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Elements to store in the List 'count' followed by the 'elements': ");
        int n = read.nextInt();

        for(int i=0; i<n; i++){
            list.add(read.next());
        }

        List<String> cloneList1 = (ArrayList<String>) list.clone();

        System.out.println(Arrays.toString(cloneList1.toArray()));
    }
}
