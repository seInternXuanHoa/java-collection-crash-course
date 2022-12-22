package gpcoder.java.collection.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashtableIST {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("volvo", "Volvo");
		map.put("bwm", "BWM");
		map.put("kia", "Kia Forte");
		map.put("ford", "Ford Ranger");

		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println("Index (by entry): " + entry.getKey() + ", " + entry.getValue());
		}
	}
}
