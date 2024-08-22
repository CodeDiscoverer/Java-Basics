package Concurrences;

import java.util.concurrent.atomic.AtomicInteger;

public class del {
    public static void main(String[] args) {

        int a = 10; //
        System.out.println(a);

        Integer aa = a; //
        System.out.println(aa);

        AtomicInteger aaa = new AtomicInteger(aa); //
        System.out.println(aaa);

    }
}

