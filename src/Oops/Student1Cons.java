package Oops;

import java.util.Scanner;

class Student1 {
    public String name;
    public int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Student1Cons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int age = scanner.nextInt();

        Student1 obj = new Student1(name, age);
        obj.display();

        scanner.close();
    }
}
