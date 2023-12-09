import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordDictionary<T> {
    private List<T> elements;

    public WordDictionary() {
        this.elements = new ArrayList<>();
    }

    public void addElement(T element) {
        elements.add(element);
    }

    public void removeElement(T element) {
        elements.remove(element);
    }

    public T getMaxElement() {
        if (elements.isEmpty()) {
            return null;
        }
        return Collections.max(elements, (e1, e2) -> {
            String str1 = e1.toString();
            String str2 = e2.toString();
            return Integer.compare(str1.length(), str2.length());
        });
    }

    public List<T> getElements() {
        return elements;
    }
}