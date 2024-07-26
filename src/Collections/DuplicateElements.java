package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter no of elements to store: ");
        int n = read.nextInt();

        int[] arr = new int[n];
        HashMap<Integer, Integer> HM = new HashMap<>();

        System.out.println("Enter " + n + " Elements:");
        for(int i=0; i<n; i++){
            arr[i] = read.nextInt();

            if(HM.containsKey(arr[i])){
                int repTime = HM.get(arr[i]);
                HM.put(arr[i], ++repTime);
            }
            else{
                HM.put(arr[i], 0);
            }
        }

        System.out.print("Duplicate Elements are ");
        for(HashMap.Entry<Integer, Integer> entry : HM.entrySet()){
            System.out.println((entry.getValue() > 0) ? entry.getKey() : "");
        }
    }

}
