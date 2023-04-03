package aufgabe2;
import java.util.NoSuchElementException;

public class SchlangeMitArray implements Schlange{
	
	int [] array;
	private int firstIndex;
	private int lastIndex;
	
	public SchlangeMitArray (int maxGroesse) {
		array = new int[maxGroesse];
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
	public void insert(int wert) throws IllegalStateException {
		// TODO Auto-generated method stub
		if (size() == capacity()) {
			throw new IllegalStateException("Schlange voll");
		}
		lastIndex++;
		array[lastIndex] = wert;
	}

	@Override
	public int remove() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new NoSuchElementException("Schlange leer");
		}
		int wert = array[firstIndex];
		firstIndex--;
		return wert;
	}

	@Override
	public int front() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new NoSuchElementException("Schlange leer");
		}
		return array[firstIndex];
	}

}
