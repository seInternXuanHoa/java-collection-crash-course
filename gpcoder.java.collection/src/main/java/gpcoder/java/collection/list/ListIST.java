package gpcoder.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIST {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add(0, "Java");
		System.out.println("Add: " + list);
		list.addAll(Arrays.asList("Java OOP", "Java IO"));
		System.out.println("Add All: " + list);
		System.out.println("Index 0: " + list.get(0));
		System.out.println("Index of first Java: " + list.indexOf("Java"));
		System.out.println("Index of last Java: " + list.indexOf("Java"));
		list.remove(0);
		System.out.println("Remove: " + list);
		list.set(0, "Java Basic");
		System.out.println("Set: " + list);
		List<String> subList = list.subList(0, 2);
		System.out.println("Sub List: " + subList);
		
		// Loop
		ListIterator<String> iterator = list.listIterator(0);
		while(iterator.hasNext()) {
			System.out.println("Index (by iterator): " + iterator.next());
		}
		
		for (String value : list) {
			System.out.println("Index (by foreach): " + value);
		}
	}
}
