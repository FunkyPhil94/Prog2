import java.util.NoSuchElementException;

public class Ringpuffer <T> {

	int size;
	int start;
	int ende;
	int capacity;
	T[] data;
	
	@SuppressWarnings("unchecked")
	public Ringpuffer (int capacity) {
		size = 0;
		start = -1;
		ende = -1;
		this.capacity = capacity;
		data = (T[]) new Object[capacity];
	}
	
	public int size() {
		return size;
	}
	
//	public int start() {
//		return start;
//	}
//	
//	public int ende() {
//		return ende;
//	}
	
	public T get(int pos) throws IndexOutOfBoundsException{
		if(pos < 0) {
			throw new IndexOutOfBoundsException("Es gibt keine Position im Minus");
		}
		return data[(start + pos) % data.length];
	}
	
	public T set(int pos, T e) throws IndexOutOfBoundsException{
		if(pos < 0) {
			throw new IndexOutOfBoundsException("Es kann keine Minusposition geändert werden");
		}
		T alt = data[(start + pos) % data.length];
		data[(start + pos) % data.length] = e;
		return alt;
	}
	
	public void addFirst(T e) {
		if(size == capacity) {
			ende = 0;
		}
		size++;
		if (start == -1) {
			start = 0;
		}
		for (int i = size; i > 0; i--) {
			data[i] = data[i-1];
		}
		data[start] = e;
		ende++;
	}
	
	public void addLast(T e) {
		if(capacity == size) {
			ende = 0;
		}
		data[ende + 1] = e;
		ende++; 
		start = ende;
		size++;
	}
	
	public T removeFirst() throws NoSuchElementException{
		if (size == 0) {
			throw new NoSuchElementException("Ringpuffer leer");
		}
		T rem = data[start];
		start++;
		size--;
		return rem;
	}
	
	public T removeLast() throws NoSuchElementException{
		if (size == 0) {
			throw new NoSuchElementException("Ringpuffer leer");
		}
		T rem = data[ende];
		start = ende;
		size--;
		return rem;
	}
}
