package guru.qa;

import java.util.ArrayList;

public class ArrayListCollection<T> {

    private final ArrayList<T> innerList = new ArrayList<>();

    public void addElement(T element) {
        innerList.add(element);
    }

    public void deleteElement(T element) {
        innerList.remove(element);
    }

    public int getElementIndex(T element) {

        for (int i = 0; i < innerList.size(); i++) {
            if (element.equals(innerList.get(i))) {
                return i;
            }
        }

        return -1;
    }
}
