package stackQueue.queue;

import java.util.HashMap;
import java.util.Set;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        System.out.println("Dequeued item is " + queue.dequeue().key);

        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);

        Set<String> keys = customers.keySet();
        for (String key: keys){
            System.out.println("Key: " + key + ": " + customers.get(key));
        }
    }
}
