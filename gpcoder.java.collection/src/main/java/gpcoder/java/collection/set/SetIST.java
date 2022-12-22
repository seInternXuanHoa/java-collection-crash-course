package gpcoder.java.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIST {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		Iterator<String> iterator = set.iterator();

		System.out.println("Set size: " + set.size());
		set.add("Java");
		System.out.println("Add: " + set);
		set.addAll(Arrays.asList("Java", "Java OOP"));
		System.out.println("Add All: " + set);
		System.out.println("Contain Java: " + set.contains("Java"));
		System.out.println("Contain all Java, C#: " + set.containsAll(Arrays.asList("Java", "C#")));
		System.out.println("Empty: " + set.isEmpty());

		// Loop:
		for (String value : set) {
			System.out.println("Index (by foreach): " + value);
		}
		iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println("Index (by iterator): " + iterator.next());
		}

		set.remove("Java");
		System.out.println("Remove: " + set);
		set.removeAll(Arrays.asList("Java OOP"));
		System.out.println("Remove all: " + set);
		set.retainAll(Arrays.asList("Java"));
		System.out.println("Retail: " + set);
		set.clear();
		System.out.println("Clear: " + set);

	}
}
