package gpcoder.java.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetIST {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("Java");
		set.add("Java OOP");
		set.add("Java IO");
		set.add("Java Collection");
		set.add("Java Networking");

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println("Index: " + iterator.next());
		}
	}
}
