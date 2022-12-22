package gpcoder.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIST {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
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
