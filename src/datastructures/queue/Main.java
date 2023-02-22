package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(1);
        myQueue.enqueue(2);
        System.out.println("dequeued value is: " + myQueue.dequeue().value);
        myQueue.printQueue();
    }
}
