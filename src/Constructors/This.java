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

    Scanner read = new Scanner(System.in);

    String n = read.nextLine();
    int rNo = read.nextInt();
    float p = read.nextFloat();

    Student s = new Student(221, "Suriya", 95);


}
