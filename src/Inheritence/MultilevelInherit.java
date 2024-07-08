package Inheritence;

class GrandFather {
    GrandFather(){
        System.out.println("Its a GrandFather");

    }
}

class Father extends GrandFather{
    Father(){
        System.out.println("Its a Father");
    }
}

class Son extends Father{
    Son(){
        System.out.println("Its a Son");
    }
}
public class MultilevelInherit {
    public static void main(String[] args) {

        Son s = new Son();

    }
}
