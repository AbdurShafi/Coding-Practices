import LinkedList.LinkedList;
import Queue.Queue;
import stack.Stack;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.printQueue();
        System.out.println("Dequqed Value " + queue.dequeue());
        queue.printQueue();
        System.out.println("peek value " + queue.peek());
        queue.printQueue();


    }
}