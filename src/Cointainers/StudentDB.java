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
                    per = s/5;
                }
            }
            StudentData.put(p,q);
            StudentMark.put(p, per);
        }

        System.out.println("\nData Base: ");
        for (Map.Entry<Integer,String> entry : StudentData.entrySet()) {
            System.out.print(entry.getKey() +" - "+ entry.getValue() + " - ");
            System.out.print((StudentMark.get(entry.getKey())*5) + " - " + StudentMark.get(entry.getKey()));
            System.out.println(" - " + calculateGrade(StudentMark.get(entry.getKey())));
        }

        System.out.print("\nSearch roll number to find : ");
        int rollNoSearch=read.nextInt();

        if(StudentData.get(rollNoSearch) != null ){
            System.out.print("The Roll no " + rollNoSearch + " is " + StudentData.get(rollNoSearch));
            System.out.println(". The Total is " + (StudentMark.get(rollNoSearch)*5) + " the percentage is "
                    + StudentMark.get(rollNoSearch) + " The Grade is " + calculateGrade(StudentMark.get(rollNoSearch)));
        }
        else{
            System.err.println("Invalid Roll Number " + rollNoSearch);
        }

    }
    public static String calculateGrade(float percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C+";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "F";
        }
    }
}
