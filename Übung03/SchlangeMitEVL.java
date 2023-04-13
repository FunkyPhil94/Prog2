import java.util.NoSuchElementException;

public class SchlangeMitEVL<T> implements Schlange<T> {
    private EVL<T> evl;

    public SchlangeMitEVL() {
        evl = new EVL<>();
    }

    @Override
    public boolean isEmpty() {
        return evl.size() == 0;
    }


    @Override
    public int size() {
        return evl.size();
    }

    @Override
    public int capacity() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void insert(T value) throws IllegalStateException {
        evl.addLast(value);
    }

    @Override
    public T remove() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Schlange ist leer");
        }
        T removed = evl.removeFirst();
        if (removed == null) {
            throw new NoSuchElementException("Element konnte nicht entfernt werden");
        }
        return removed;
    }

    @Override
    public T front() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Schlange ist leer");
        }
        return evl.getFirst();
    }
}
