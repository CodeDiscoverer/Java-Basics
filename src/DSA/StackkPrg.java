package DSA;

class Stackk{
    int maxSize;
    int[] sArray;
    int top;

    Stackk(int size){
        maxSize = size;
        sArray = new int[maxSize];
        top = -1;
    }

    public void push(int value){
        if(top == maxSize-1){
            System.err.println("Stack Overflow");
        }
        else{
            sArray[++top] = value;
            System.out.println(value + " Pushed Successfully!");
        }
    }

    public void pop(){
        if(top == -1){
            System.err.println("Oops! Stack Underflow.");
        }
        else{
            int removedElement = sArray[top--];
            System.err.println(removedElement + " Element Popped out");
        }
    }

    public void peek(){
        if(top == -1){
            System.err.println("Oops! Stack Underflow.");
        }
        else{
            System.out.println(sArray[top]);
        }
    }

    public void display(){
        if(top == -1){
            System.err.println("Oops! Stack Underflow.");
        }
        else{
            for(int i = top; i >= 0; i--){
                System.out.println(sArray[i]);
            }
        }
    }
}

public class StackkPrg {
    public static void main(String[] args) {

        Stackk s = new Stackk(5);

        s.pop();
        s.peek();
        s.push(10);
        s.push(20);
        s.display();
    }
}
