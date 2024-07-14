package DSA;

class Queuee{
    int front, rear, maxSize;
    int[] queue;

    Queuee(int size){
        maxSize = size;
        front = 0;
        rear = -1;
        queue = new int[size];
    }

    public void insert(int value){
        if(rear == maxSize-1){
            System.err.println("Oops! Queue is Full");
        }
        else{
            queue[++rear] = value;
            System.out.println(value + " Inserted into Queue Successfully!");
        }
    }

    public void delete(){
        if (rear == -1){
            System.err.println("Oops! Queue is Empty");
        }
        else{
            int element = queue[front++];
            System.out.println(element + " Element Removed");
        }
    }

    public void peek(){
        if (rear == -1){
            System.err.println("Oops! Queue is Empty");
        }
        else{
            System.out.println(queue[front]);
        }
    }

    public void display(){

    }

}
public class QueuePrg {
}
