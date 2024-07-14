package DSA;
public class LinkedListS {

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        System.out.println("Before");
        System.out.println(newNode);
        System.out.println(newNode.data);
        System.out.println(newNode.next);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            System.out.println("tail.next" + tail.next);
            tail = newNode;
        }
        System.out.println("tail" + tail);
        System.out.println("After");
        System.out.println(newNode);
        System.out.println(newNode.data);
        System.out.println(newNode.next);
        System.out.println();
    }

    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListS sList = new LinkedListS();

        sList.addNode(10);
        sList.addNode(20);
        sList.addNode(30);
        sList.addNode(40);

        sList.display();
    }
}