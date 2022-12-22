package gpcoder.java.collection.set;

import java.util.Comparator;

public class VehicleComparator implements Comparator<Vehicle> {

	public int compare(Vehicle o1, Vehicle o2) {
		return -(o1.getName().compareTo(o2.getName()));
	}
}
