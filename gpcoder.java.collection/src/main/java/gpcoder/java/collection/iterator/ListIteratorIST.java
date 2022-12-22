package gpcoder.java.collection.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorIST {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("Java", "Java OOP", "Java IO"));
		ListIterator<String> listIterator = list.listIterator();

		// Loop:
		while (listIterator.hasNext()) {
			System.out.println("Index: " + listIterator.next());
		}

		// Delete:
		while (listIterator.hasPrevious()) {
			if (listIterator.previous().equals("Java")) {
				listIterator.remove();
			}
		}
		System.out.println("List: " + list);
		System.out.println("List is empty: " + list.isEmpty());
		System.out.println("List contain Java: " + list.contains("Java"));
	}
}
