
import java.util.NoSuchElementException;


public class StapelMitArray <T> implements Stapel <T> {
	
	Object [] array;
	private int index;
	
	public StapelMitArray(int maxGroesse) {
		array = new Object [maxGroesse];
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
	public void insert(T wert) throws IllegalStateException {
		// TODO Auto-generated method stub
		if (size() == capacity()) {
			throw new IllegalStateException("Speicher voll");
		}
		index ++;
		array[index] = wert;
	}

	@Override
	public T remove() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new NoSuchElementException("Speicher leer");
		}
		T wert =(T) array[index];
		index--;
		return  wert;
	}

	@Override
	public T top() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new NoSuchElementException("Stapel leer");
		}
		return  (T) array[index];
	}

	public void applyToAll (Funktion<T> f) {
		for (int i = 0; i <= index; i++) {
			T e = (T) array[i];
			array[i] = f.auswerten(e);
			
		}
	}

}
