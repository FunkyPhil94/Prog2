
import java.util.NoSuchElementException;

interface Stapel<T> extends Puffer<T> {
	
	T top() throws NoSuchElementException;

}
