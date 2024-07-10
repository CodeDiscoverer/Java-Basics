/* Given an integer array flowerbed containing 0's and 1's,
 where 0 means empty and 1 means not empty, and an integer n,
 return true if n new flowers can be planted in the
 flowerbed without violating the no-adjacent-flowers rule and false otherwise. */

package PracticePrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerBed {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.print("Enter the Length: ");
        int length = read.nextByte();
        int count0 = 0, temp = 0;

        for(int i = 0; i < length; i++){
            temp = read.nextByte();
            list.add(temp);

            if(temp == 0) { count0++;}
        }

        System.out.print("Enter the No of Flowers to be planted: ");
        int value = read.nextByte();
        if(count0 % 2 == 0){ value++;}

        System.out.println(list);
        if(value > count0/2 ){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}
