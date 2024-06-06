package Collections;

import java.util.*;
import java.lang.*;

public class CloneArray {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Elements to store in List: ");
        int n = read.nextInt();

        ArrayList<String> list = new ArrayList<>();
        List<String> cloneList1 = (ArrayList<String>) list.clone();

        for(int i=0; i<n; i++){
            list.add(read.next());
        }

    }
}
