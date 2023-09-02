package guru.qa;

import java.util.HashSet;

public class HashSetCollection<E> {

    private final HashSet<E> innerHashSet = new HashSet<>();

    public void addElement(E element) {
        innerHashSet.add(element);
    }
    public void deleteElement(E element) {
        innerHashSet.remove(element);
    }
    public Object findElement(E element) {

            for (E entry : innerHashSet){
                if (entry.equals(element)) {
                    return entry;
                }
            }

        System.out.println("Element not found");
        return null;
    }
}
