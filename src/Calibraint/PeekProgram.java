package Calibraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PeekProgram {

    public static void peekElem(List<Integer> list){

        int max = Collections.max(list);
        int indexMax = list.indexOf(max);

        if(indexMax == list.size()-1 || indexMax == 0){
            System.out.println("NULL");
        }
        else if(max > list.get(indexMax-1) && max > list.get(indexMax+1)){
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.print("Enter Value of n: ");
        int n = read.nextInt();
        System.out.println("Enter " + n + " Values into Array List: ");
        for (int i = 0; i < n; i++) {
            list.add(read.nextInt());
        }

        peekElem(list);
    }
}
