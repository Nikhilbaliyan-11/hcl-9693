import java.util.*;

public class ArrayDequeueQueue {
    // there are two pointers one is front and another is rear
    // if we want to delete any element then front element will be deleted in queue
    // in dequeue we can delete from rear but we can delete from both the ends
    // we can implement stack using dequeue which is faster then normal stack b/c normal stack is implementing vector which is thread safe that is why slower
    //
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println(queue.element());  // retrives but does not delete, the head of the queue

        System.out.println(queue.peek());    // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty

        System.out.println(queue.poll());    // Retrieves and removes the head of this queue, or returns null if this queue is empty.

        System.out.println(queue.remove());  // Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.


// implementing stack methods using arraydequeue

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.addFirst(1);  // dequeue equivalent method to stack
        stack.removeFirst(); // ''''
        stack.push(2);
        stack.push(3);

        stack.pop();
        stack.push(4);

         stack.peek();
         stack.peekFirst();

// priority queue is a queue which has priority to each element
        // min heap data structure is used
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        // Peek at the highest priority element (smallest number)
        System.out.println("Top priority element: " + pq.peek()); // 10

        // Remove elements in order of priority
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // Output: 10 20 30 40
        }

        // for max heap

        PriorityQueue <Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.offer(40);
        pq2.offer(10);
        pq2.offer(30);

        pq.poll();


    }

}
