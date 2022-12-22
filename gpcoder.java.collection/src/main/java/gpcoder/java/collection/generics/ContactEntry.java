package gpcoder.java.collection.generics;

public class ContactEntry<K, V> extends KeyValuePair<K, V> implements Deleteable<ContactEntry<K, V>> {

	public ContactEntry() {
		super();
	}

	public ContactEntry(K key, V value) {
		super(key, value);
	}

	@Override
	public void delete(ContactEntry<K, V> object) {
		System.out.println("Deleted: " + object);
	}

	public <T> T store(T object) {
		System.out.println("Store: " + object);
		return object;
	}
}
