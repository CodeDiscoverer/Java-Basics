package Interface;


interface int1 {
    int x=100;
    void display();

}

class A1 implements int1 {
    int a,b,c;


    @Override
    public void display() {
        a=10;b=20;
        c=a+b;
        System.out.println("Addition of a+b is:" +c);
    }

    public static void main (String[] args) {

        A1 o1 = new A1();
        o1.display();
        System.out.println("value of x is:" +x);
    }
}
