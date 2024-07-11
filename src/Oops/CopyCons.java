package Oops;

class Car {
    public String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    // Copy constructor (constructor that takes an object of the same class)
    public Car(Car c) {
        this.carName = c.carName;
    }
}

public class CopyCons {
    public static void main(String[] args) {
        Car originalCar = new Car("Beat"); // Parameterized constructor called here
        System.out.println(originalCar.carName);

        Car copiedCar = new Car(originalCar); // Copy constructor called here
        System.out.println(copiedCar.carName);
    }
}
