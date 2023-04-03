package aufgabe2;
import java.util.NoSuchElementException;

interface Puffer {
	
	boolean isEmpty();
	int size();
	int capacity();	
	void insert(int value) throws IllegalStateException;	
	int remove() throws NoSuchElementException;

}
