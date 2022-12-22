package gpcoder.java.collection.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorIST {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("Java", "Java OOP", "Java IO"));
		Iterator<String> iterator = list.iterator();
		
		// Loop:
		while (iterator.hasNext()) {
			System.out.println("Index (by iterator): " + iterator.next());
		}
		
		for (String value : list) {
			System.out.println("Index (by foreach): " + value);
		}
		
		// Delete:
		iterator = list.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().equals("Java")) {
				iterator.remove();
			}
		}
		System.out.println("List: " + list);
		System.out.println("List is empty: " + list.isEmpty());
		System.out.println("List contain Java: " + list.contains("Java"));
	}
}
