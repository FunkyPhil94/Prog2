package aufgabe2;
import java.util.NoSuchElementException;

public class StapelMitArray implements Stapel {
	
	int array [];
	private int index;
	
	public StapelMitArray(int maxGroesse) {
		array = new int [maxGroesse];
		index = -1;
	}
	

	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return index == -1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return index +1;
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
			throw new IllegalStateException("Speicher voll");
		}
		index ++;
		array[index] = wert;
	}

	@Override
	public int remove() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new NoSuchElementException("Speicher leer");
		}
		int wert = array[index];
		index--;
		return wert;
	}

	@Override
	public int top() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new NoSuchElementException("Stapel leer");
		}
		int wert = array[index];
		return wert;
	}

	public void applyToAll (Funktion f) {
		for (int i = 0; i <= index; i++) {
			array[i] = f.auswerten(array[i]);
		}
	}

}
