
import java.util.NoSuchElementException;

public class SchlangeMitArray <T> implements Schlange <T>{
	
	Object [] array;
	private int firstIndex;
	private int lastIndex;
	
	public SchlangeMitArray (int maxGroesse) {
		array = new Object [maxGroesse];
		firstIndex = 0;
		lastIndex = -1;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return firstIndex > lastIndex;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return lastIndex - firstIndex +1;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return array.length;
	}

	@Override
	public void insert(T wert) throws IllegalStateException {
		// TODO Auto-generated method stub
		if (size() == capacity()) {
			throw new IllegalStateException("Schlange voll");
		}
		lastIndex++;
		array[lastIndex] = wert;
	}

	@Override
	public T remove() throws NoSuchElementException {
		// TODO Auto-generated method stub
	    if (isEmpty()) {
	        throw new NoSuchElementException("Schlange leer");
	    }
	    T wert = (T) array[firstIndex];
	    firstIndex++;
	    return wert;
	}

	@Override
	public T front() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new NoSuchElementException("Schlange leer");
		}
		return (T) array[firstIndex];
	}

}
