package Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Queuedemo {
    public static void main(String[] args) {
    	Queue queue = new PriorityQueue();
    	
    	System.out.println(queue.peek());
    	
    	Random random = new Random();
    	
    	for(int i =0; i <= 10; i++) {
    		queue.offer(random.nextInt(1,20));
    	}
    	System.out.println(queue);
    	System.out.println(queue.poll());
    	System.out.println(queue.remove());
    }
}
