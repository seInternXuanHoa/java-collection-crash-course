package gpcoder.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapIST {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> mapBak = map;
		
		System.out.println("Map size: " + map.size());
		map.clear();
		System.out.println("Clear: " + map);
		System.out.println("Contain key Java: " + map.containsKey("Java"));
		System.out.println("Contain value Java: " + map.containsValue("Java"));
		System.out.println("Equal: " + map.equals(mapBak));
		map.put("volvo", "Volvo");
		System.out.println("Add: " + map);
		map.putAll(mapBak);
		System.out.println("Add all: " + map);
		System.out.println("Volvo: " + map.get("Volvo"));
		System.out.println("Hash code: " + map.hashCode());
		System.out.println("Empty: " + map.isEmpty());
		map.remove("Volvo");
		System.out.println("Remove: " + map);
		System.out.println("Key: " + map.keySet());
		System.out.println("Value: " + map.values());
		System.out.println("Entry: " + map.entrySet());
	}
}
