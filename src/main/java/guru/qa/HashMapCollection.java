package guru.qa;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapCollection<K, V> {

    private final HashMap<K, V> innerHashMap = new HashMap<>();

    public void addElement(K key, V value) {
        innerHashMap.put(key, value);
    }

    public void deleteElement(K key, V value) {
        innerHashMap.remove(key, value);
    }

    public Object getElementByKey(K key) {

        for (Entry entry : innerHashMap.entrySet()) {
            if (innerHashMap.containsKey(key)) {
                return innerHashMap.get(key);
            }
        }

        System.out.println("Element not found");
        return null;

    }
}
