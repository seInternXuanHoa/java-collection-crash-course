package gpcoder.java.collection.generics;

public class GenericsIST {
	public static void main(String[] args) {
		KeyValuePair<String, String> keyValuePairString = new KeyValuePair<>();
		KeyValuePair<Integer, Integer> keyValuePairInteger = new KeyValuePair<>();

		keyValuePairString.setKey("String Key");
		keyValuePairString.setValue("String Value");
		keyValuePairInteger.setKey(1);
		keyValuePairInteger.setValue(2);

		System.out.println(keyValuePairString);
		System.out.println(keyValuePairInteger);
		
		ContactEntry<String, String> contactEntry = new ContactEntry<>("seInternXuanHoa", "seInternXuanHoa");
		System.out.println(contactEntry);
		
		contactEntry.delete(contactEntry);
		System.out.println("Store: " + contactEntry.store(contactEntry));
	}
}
