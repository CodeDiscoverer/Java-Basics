package Oops;

class Father{
    String name = "father";
    public void DisplayName(){
        System.out.println(name);
    }
}

class Son extends Father{
    String name = "son";
    public void DisplayName(){
        super.DisplayName();
        System.out.println(name);
    }
}

public class DynamicBinding {
    public static void main(String[] args) {

        // Father f = new Father();
        // Son s = new Son();
        Father x = new Son(); // Dynamic Binding

        x.DisplayName();
    }
}
