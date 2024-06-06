package Cointainers;

import java.util.*;
public class StudentDB {

    public static void main(String[] args) {

        HashMap<Integer,String> StudentData = new HashMap<>();
        HashMap<Integer,Float> StudentMark = new HashMap<>();

        Scanner read = new Scanner(System.in);

        System.out.print("Enter number of Students: ");
        int n = read.nextInt();

        for(int i=0; i<n; i++){

            float s = 0, per = 0;
            System.out.print("\nSet roll number for "+ (i+1) +": ");
            int p = read.nextInt();
            read.nextLine();
            System.out.print("Enter name for Roll No " + p + ": ");
            String q = read.nextLine();
            {
                System.out.println("Enter 5 Subject Marks: ");
                for(int j=0; j<5; j++){
                float r = read.nextFloat();
                s += r;
                per = s/5;}
            }
            StudentData.put(p,q);
            StudentMark.put(p, per);
        }

        System.out.println("\nData Base: ");
        for (Map.Entry<Integer,String> entry : StudentData.entrySet()) {
            System.out.print(entry.getKey() +" "+ entry.getValue() + " ");
            System.out.println((StudentMark.get(entry.getKey())*5) + " " + StudentMark.get(entry.getKey()));
        }


        System.out.print("\nSearch roll number to find : ");
        int rollNoSearch=read.nextInt();

        System.out.print("The Roll no " + rollNoSearch + " is " + StudentData.get(rollNoSearch));
        System.out.println(". The Total is " + (StudentMark.get(rollNoSearch)*5) + " the percentage is " + StudentMark.get(rollNoSearch));

    }
}
