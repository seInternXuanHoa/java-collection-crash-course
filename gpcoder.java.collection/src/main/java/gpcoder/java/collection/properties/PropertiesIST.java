package gpcoder.java.collection.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesIST {
	private static final String FILE_PATH = "config.properties";

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// System
		try {
			Properties properties = System.getProperties();
			Set<Entry<Object, Object>> set = properties.entrySet();
			Iterator<Entry<Object, Object>> iterator = set.iterator();

			while (iterator.hasNext()) {
				Entry<Object, Object> entry = iterator.next();
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Create File:
		try (FileOutputStream objectOutputStream = new FileOutputStream(FILE_PATH)) {
			Properties properties = new Properties();
			properties.setProperty("host", "localhost");
			properties.save(objectOutputStream, null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Reader
		try {
			Properties properties = new Properties();
			FileReader fileReader = new FileReader(FILE_PATH);
			properties.load(fileReader);

			System.out.println("Author: " + properties.getProperty("author"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
