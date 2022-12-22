package gpcoder.java.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapIST {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>(new Comparator<String>() {

			public int compare(String o1, String o2) {
				return -(o1.compareTo(o2));
			}

		});
		map.put("volvo", "Volvo");
		map.put("bwm", "BWM");
		map.put("kia", "Kia Forte");
		map.put("ford", "Ford Ranger");

		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println("Index (by entry): " + entry.getKey() + ", " + entry.getValue());
		}
	}
}
