package gpcoder.java.collection.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeIST {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Java");
		deque.offer("Java OOP");
		deque.addFirst("Java Basic");
		deque.addLast("Java IO");

		for (String value : deque) {
			System.out.println("Index: " + value);
		}

		deque.poll();
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
	}
}
