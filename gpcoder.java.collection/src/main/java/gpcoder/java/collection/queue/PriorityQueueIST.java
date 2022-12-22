package gpcoder.java.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueIST {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.offer("Java");
		queue.offer("Java OOP");
		queue.offer("Java IO");

		// Loop:
		while (true) {
			String string = queue.poll();
			if (string != null) {
				System.out.println("Index: " + string);
			} else {
				break;
			}
		}

	}
}
