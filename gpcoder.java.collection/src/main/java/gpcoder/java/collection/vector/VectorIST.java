package gpcoder.java.collection.vector;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorIST {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		List<String> listBak = (List<String>) list.clone();

		list.add("Java");
		list.add("Java OOP");
		list.add(0, "Java IO");
		System.out.println("Add: " + list);
		list.addAll(list);
		System.out.println("Add all: " + list);

		// Loop:
		Enumeration<String> enumeration = list.elements();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println("Index: " + string);
		}

		System.out.println("Index 3: " + list.get(3));
		System.out.println("First index of Java: " + list.indexOf("Java"));
		System.out.println("Last index of Java: " + list.lastIndexOf("Java"));
		list.remove(3);
		System.out.println("Remove: " + list);
		list.removeAll(Arrays.asList("Java OOP", "Java"));
		System.out.println("Remove all: " + list);
		list.retainAll(Arrays.asList("Java IO"));
		System.out.println("Retail: " + list);
		list.set(0, "Java");
		System.out.println("Set: " + list);
		list.clear();
		System.out.println("Clear: " + list);
		System.out.println("Clone: " + listBak);
	}
}
