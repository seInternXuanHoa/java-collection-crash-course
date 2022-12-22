package gpcoder.java.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetIST {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("Java");
		set.add("Java OOP");
		set.add("Java IO");
		set.add("Java Collection");
		set.add("Java Networking");

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println("Index: " + iterator.next());
		}

		Set<Vehicle> vehicles = new TreeSet<Vehicle>(/*
														 * new VehicleComparator()
														 */);
		vehicles.add(new Vehicle("Volvo", 200));
		vehicles.add(new Vehicle("BWM", 200));
		vehicles.add(new Vehicle("Kia Forte", 200));
		vehicles.add(new Vehicle("Ford Ranger", 200));

		Iterator<Vehicle> vehicleIterator = vehicles.iterator();
		while (vehicleIterator.hasNext()) {
			System.out.println("Index: " + vehicleIterator.next());
		}

		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(new Vehicle("Volvo", 200));
		list.add(new Vehicle("BWM", 200));
		list.add(new Vehicle("Kia Forte", 200));
		list.add(new Vehicle("Ford Ranger", 200));

		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, new VehicleComparator());
		System.out.println(list);
	}
}
