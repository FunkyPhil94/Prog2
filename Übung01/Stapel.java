package aufgabe2;
import java.util.NoSuchElementException;

interface Stapel extends Puffer {
	
	int top() throws NoSuchElementException;

}
