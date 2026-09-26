class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);

        node1.next = node2;

        System.out.println("First Node Data: " + node1.data);
        System.out.println("Second Node Data: " + node2.data);
    }
}