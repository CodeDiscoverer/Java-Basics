package Collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
public class ConCurrHM {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();

        hm.put(9, "Guhan");
        hm.put(154, "Suriya");

        System.out.println("HashMap 👇");
        for(int key : hm.keySet()){
            System.out.println("Key: " + key + " | Value: " + hm.get(key));
            if(key == 9){
                //hm.put(10, "Dharun");
            }
        }

        chm.put(9, "Guhan");
        chm.put(154, "Suriya");

        System.out.println("\nConcurrent HashMap👇");
        for(int key : chm.keySet()){
            System.out.println("Key: " + key + " | Value: " + chm.get(key));
            if(key == 9){
                chm.put(10, "Dharun");
            }
        }
    }
}
