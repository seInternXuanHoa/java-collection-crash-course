package gpcoder.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIST {
	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		
		System.out.println("List: " + lists);
		lists.add("Java Collection");
		System.out.println("Add: " + lists);
		lists.add(0, "Java");
		System.out.println("Add: " + lists);
		lists.set(0, "Java OOP");
		System.out.println("Set: " + lists);
		
		// Loop:
		for (String value : lists) {
			System.out.println("List Index: " + value);
		}
		
		System.out.println("To Array: " + Arrays.toString(lists.toArray()) + ", has type: " + lists.toArray().getClass().getSimpleName());
		lists.addAll(Arrays.asList("JSP", "Servlet"));
		System.out.println("Add All: " + lists);
		System.out.println("Object at index 3: " + lists.get(3));
		System.out.println("Index of first JSP: " + lists.indexOf("JSP"));
		System.out.println("Index of last JSP: " + lists.lastIndexOf("JSP"));
		lists.remove("JSP");
		System.out.println("Remove: " + lists);
		lists.retainAll(Arrays.asList("Java"));
		System.out.println("Retain: " + lists);
		lists.removeAll(Arrays.asList("Java"));
		System.out.println("Remove all: " + lists);
		lists.add("Java");
		lists.clear();
		System.out.println("Clear: " + lists);
		System.out.println("Array list: " + lists.size());
	}
}
