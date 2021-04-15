package solutions.kuy7;

public class CircularList<T> {
    T[] elements;
    int index = -1;

    public CircularList(final T... elements) {
        if(elements.length == 0)
          throw new NullPointerException();
        this.elements = elements;
    }

    T next() {
        if(elements.length == index + 1)
            index = -1;
        return elements[++index];
    }

    T prev() {
        if(index <= 0)
            index = elements.length;
        return elements[--index];
    }
}