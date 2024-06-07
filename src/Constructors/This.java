package Constructors;

import java.util.Scanner;

class Student{
    int rollNo;
    String name;
    float percentage;

    Student(int rollNo, String name, float percentage){
        this.name = name;
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    void printDetails(){
        System.out.println("Your name is " +name);
        System.out.println("Your roll number is " +rollNo);
        System.out.println("Your Percentage is " +percentage);
    }
}

public class This {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String name = read.nextLine();
        int rollNo = read.nextInt();
        float percentage = read.nextFloat();

        Student s = new Student(rollNo, name, percentage);
        s.printDetails();
    }
}
