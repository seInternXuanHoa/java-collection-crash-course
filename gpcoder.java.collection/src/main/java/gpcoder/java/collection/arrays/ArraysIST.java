package gpcoder.java.collection.arrays;

import java.util.Arrays;

public class ArraysIST {
	public static void main(String[] args) {
		String[] vehicle = new String[] { "Volvo", "Kia Forte", "Ford Ranger" };
		String[] vehicleBak = Arrays.copyOf(vehicle, vehicle.length);

		System.out.println("To string: " + Arrays.toString(vehicle));
		System.out.println("Deep to string: " + Arrays.deepToString(vehicle));
		Arrays.sort(vehicle);
		System.out.println("Sort: " + Arrays.toString(vehicle));
		System.out.println("Binary sort: " + Arrays.binarySearch(vehicle, "Volvo"));
		Arrays.fill(vehicle, "Volvo");
		System.out.println("Fill: " + Arrays.toString(vehicle));
		System.out.println("Copy of: " + Arrays.toString(vehicleBak));
		vehicleBak = Arrays.copyOfRange(vehicle, 0, 2);
		System.out.println("Copy of range: " + Arrays.toString(vehicleBak));
		System.out.println("As List: " + Arrays.asList(vehicle) + ", has type: "
				+ Arrays.asList(vehicle).getClass().getSimpleName());
		System.out.println("Equal: " + Arrays.equals(vehicle, vehicle));
		System.out.println("Deep Equal: " + Arrays.deepEquals(vehicle, vehicle));
	}
}
