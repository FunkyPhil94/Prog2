import java.util.NoSuchElementException;

public class DynArray <T> {
	
	int size;
	int capacity = 1;
	T[] data;
	
	@SuppressWarnings("unchecked")
	public DynArray() {
		size = 0;
		capacity = 1;
		data = (T[]) new Object[capacity];
	}
	
	public int size() {
		return size;
	}
	
	public int capacity() {
		return capacity;
	}
	
	public T get(int pos) throws IndexOutOfBoundsException{
		if(pos > size || pos < 0) {
			throw new IndexOutOfBoundsException("Kein Inhalt");
		}
		return data[pos];
	}
	
	public T set(int pos, T e) throws IndexOutOfBoundsException{
		if(pos > size || pos < 0) {
			throw new IndexOutOfBoundsException("Position nicht belegt");
		}
		T alt = data[pos];
		data[pos] = e;
		return alt;
	}
	
	public void addFirst(T e) {
		if(size == capacity) {
			increase();
		}
		for (int i = size; i > 0; i--) {
			data[i] = data[i-1];
		}
		data[0] = e;
		size++;
	}
	
	public void addLast(T e) {
		if(size == capacity) {
			increase();
		}
		data[size] = e; 
		size++;
	}
	
	public T removeFirst() throws NoSuchElementException{
		if (size == 0) {
			throw new NoSuchElementException("Array leer");
		}
		T rem = data[0];
		for (int i = 1; i < size; i++) {
			data[i-1] = data[i];
		}
		size--;
		if (size <= capacity/4) {
			decrease();
		}
		return rem;
	}
	
	public T removeLast() throws NoSuchElementException{
		if (size == 0) {
			throw new NoSuchElementException("Array leer");
		}
		T rem = data[size-1];
		size--;
		if (size <= capacity/4) {
			decrease();
		}
		return rem;
	}
	
	private void increase() {
		capacity *= 2;
		@SuppressWarnings("unchecked")
		T[] newData = (T[]) new Object[capacity];
		for (int i = 0; i < size; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}
	
    private void decrease() {
        capacity /= 2;
        @SuppressWarnings("unchecked")
		T[] newData = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

}
