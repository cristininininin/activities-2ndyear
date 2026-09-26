import java.util.ArrayDeque;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> myQueue = new ArrayDeque<>();

        myQueue.offer("Alice");
        myQueue.offer("Bob");
        myQueue.offer("Charlie");

        System.out.println("Queue: " + myQueue);

        String first = myQueue.poll();
        System.out.println("Dequeued: " + first);
        System.out.println("Queue after dequeue: " + myQueue);

        String front = myQueue.peek();
        System.out.println("Front of queue: " + front);
    }
}