package gpcoder.java.collection.list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListIST {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<String> listBak = (LinkedList<String>) list.clone();
		
		System.out.println("List size: " + list.size());
		
		System.out.println("List size: " + list.size());
		list.add(0, "Java");
		System.out.println("Add: " + list);
		list.addAll(0, Arrays.asList("Java IO", "Java Exception"));
		System.out.println("Add all: " + list);
		System.out.println("Java Object: " + list.get(2));
		System.out.println("Contain Java: " + list.contains("Java"));
		System.out.println("Index of Java: " + list.indexOf("Java"));
		System.out.println("Index of last Java: " + list.lastIndexOf("Java"));
		list.remove("Java");
		System.out.println("Remove: " + list);
		list.set(0, "Java Basic");
		System.out.println("Set: " + list);
		
		System.out.println("Iterator: " + list.listIterator());
		
		list.addFirst("Java Basic");
		System.out.println("Add First: " + list);
		System.out.println("Get First: " + list.getFirst());
		list.addLast("Sping");
		System.out.println("Add Last: " + list);
		System.out.println("Get Last: " + list.getLast());
		list.removeFirst();
		System.out.println("Remove First: " + list);
		list.removeLast();
		System.out.println("Remove Last: " + list);
		
		list.clear();
		System.out.println("Clear: " + list);
		System.out.println("Clone: " + listBak);
	}
}
