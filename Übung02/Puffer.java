
import java.util.NoSuchElementException;

interface Puffer <T> {
	
	boolean isEmpty();
	int size();
	int capacity();	
	void insert(T value) throws IllegalStateException;	
	T remove() throws NoSuchElementException;

}
