package Collections;

import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {

        HashMap<Integer, Integer> HM = new HashMap<>();
        HashMap<Integer, String> HM2 = new HashMap<>();
        HashMap<String, Integer> HM3 = new HashMap<>();
        HashMap<String, String> HM4 = new HashMap<>();

        HM.put(10,20);
        HM2.put(10,"30");
        HM3.put("10", 40);
        HM4.put("10", "50");

        System.out.println(HM.get(10).hashCode());
        System.out.println(HM2.get(10).hashCode());
        System.out.println(HM3.get("10").hashCode());
        System.out.println(HM4.get("10").hashCode());
        System.out.println(HM.remove(10).hashCode());
    }
}
