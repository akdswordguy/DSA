package DSA_implementation;
import java.util.*;



public class queue {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        // Queue operations
        //Queue add, remove, peek, isEmpty, size
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        System.out.println("Queue: " + myQueue.peek());
        myQueue.remove();
        System.out.println("The front element: " + myQueue.peek());
        System.out.println("Is queue empty? " + myQueue.isEmpty());
        System.out.println("Queue size: " + myQueue.size());
        System.out.println("Queue elements: " + myQueue);
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        System.out.println(myQueue.isEmpty());

    }

    
}
