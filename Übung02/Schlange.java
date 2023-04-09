
import java.util.NoSuchElementException;

interface Schlange<T> extends Puffer<T> {
	
	T front() throws NoSuchElementException;

}
