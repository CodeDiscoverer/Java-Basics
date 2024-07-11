package Oops;

import java.util.Scanner;

class Rectangle {
    public int length;
    public int breadth;

    public void area() {
        System.out.println(length * breadth);
    }

    public void perimeter() {
        System.out.println(2 * (length + breadth));
    }
}

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle r = new Rectangle();

        r.length = scanner.nextInt();
        r.breadth = scanner.nextInt();

        r.area();
        r.perimeter();

        scanner.close();
    }
}

