package aufgabe2;
import java.util.NoSuchElementException;

interface Schlange extends Puffer {
	
	int front() throws NoSuchElementException;

}
