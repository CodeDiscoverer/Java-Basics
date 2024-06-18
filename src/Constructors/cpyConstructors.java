package Constructors;

import java.util.Scanner;

class Student1 {
    int rollNo;
    String name;
    float percentage;

    // Regular constructor
    Student1(int rollNo, String name, float percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    // Copy constructor (corrected)
    Student1(Student1 original) {
        this.rollNo = original.rollNo;
        this.name = original.name;
        this.percentage = original.percentage;
    }

    void printDetails() {
        System.out.println("Your name is " + name);
        System.out.println("Your roll number is " + rollNo);
        System.out.println("Your Percentage is " + percentage);
    }
}

public class cpyConstructors {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = read.nextLine();
        System.out.println("Enter roll number:");
        int rollNo = read.nextInt();
        System.out.println("Enter percentage:");
        float percentage = read.nextFloat();

        // Using regular constructor to create Student1 object
        Student1 s1 = new Student1(rollNo, name, percentage);
        System.out.println("\nDetails of student 1:");
        s1.printDetails();

        // Using copy constructor to create another Student1 object
        // Creating a copy of s1
        Student1 s2 = new Student1(s1);
        System.out.println("\nDetails of copied student 2:");
        s2.printDetails();
    }
}
