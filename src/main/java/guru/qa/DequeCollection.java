package guru.qa;

import java.util.Deque;
import java.util.LinkedList;

public class DequeCollection<T> {

    private final Deque<T> innerDeque = new LinkedList<>();

    public void addElement(T element) {
        innerDeque.add(element);
    }

    public void deleteElement(T element) {
        innerDeque.remove(element);
    }

    public Object findElement(T element) {

        for (T entry : innerDeque) {
            if (element.equals(entry)) {
                return entry;
            }
        }

        System.out.println("Element not found");
        return null;
    }
}
