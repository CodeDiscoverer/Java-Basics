package Oops;

class Person {
    private String name;
    private int age;

    public Person() {
        name = "Unknown";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class BasicConstructor {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Alice", 30);

        // Accessing object attributes
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}