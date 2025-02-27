package collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        /*
        Queue = Linear DS that follows FIFO (first in first out) approach
        Operations =
        1.add or offer
        2.remove or poll
        3.peek
        4.size
         */

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        //remove
        System.out.println("Removing element = " + queue.remove());
        System.out.println("Poll = "+ queue.poll());
        System.out.println("Adding using offer = " + queue.offer(50));
        System.out.println("Checking size = " + queue.size());
    }
}
