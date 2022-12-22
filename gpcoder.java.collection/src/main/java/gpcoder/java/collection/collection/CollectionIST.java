package gpcoder.java.collection.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionIST {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> listBak = new ArrayList<>();
		Collections.copy(list, listBak);

		Collections.addAll(list, "Java");
		System.out.println("List: " + list);
		System.out.println("List BAK: " + listBak);
		System.out.println("Binary search: " + Collections.binarySearch(list, "Java"));
		System.out.println("Disjoin: " + Collections.disjoint(list, listBak));
		System.out.println("Empty Enum: " + Collections.emptyEnumeration());
		System.out.println("Empty Iterator: " + Collections.emptyIterator());
		System.out.println("Empty List Iterator: " + Collections.emptyListIterator());
		System.out.println("Empty list: " + Collections.emptyList());
		System.out.println("Empty map: " + Collections.emptyMap());
		System.out.println("Empty set: " + Collections.emptySet());
		Collections.fill(list, "Java OOP");
		System.out.println("Fill: " + list);
		System.out.println("Index of sublist: " + Collections.indexOfSubList(list, Arrays.asList("Java")));
		System.out.println("Last Index of sublist: " + Collections.lastIndexOfSubList(list, Arrays.asList("Java")));
		System.out.println("To List: " + Collections.list(Collections.enumeration(list)));
		System.out.println("Max: " + Collections.max(list));
		System.out.println("Min: " + Collections.min(list));
		System.out.println("Replace all: " + Collections.replaceAll(list, "Java OOP", "Java"));
		Collections.reverse(list);
		System.out.println("Reverse: " + list);
		System.out.println("Reverse Order: " + Collections.reverseOrder());
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("Sort: " + list);
		list.add("Java Basic");
		Collections.swap(list, list.indexOf("Java"), list.indexOf("Java Basic"));
		System.out.println("Swap: " + list);
		System.out.println("Frequency: " + Collections.frequency(list, "Java"));
		Collections.shuffle(list);
		System.out.println("Suffe: " + list);
		Collections.rotate(list, 1);
		System.out.println("Rotate: " + list);
	}
}
