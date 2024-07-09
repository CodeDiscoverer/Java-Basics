package Collections;

import java.util.*;

public class HashSett {
    public static void main(String[] args) {
        HashSet <Integer> HS = new HashSet<>();

        HS.add(1);
        HS.add(2);

        System.out.println(HS);

        HS.add(2);
        System.out.println(HS);
    }
}
