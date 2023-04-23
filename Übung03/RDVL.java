import java.util.NoSuchElementException;



public class RDVL <T>{
	
	
	ListenEl entry = null;
	int size = 0;
	
	class ListenEl{
		T data;
		ListenEl prev;
		ListenEl next;
		
		ListenEl (T o) {
			data = o;
			prev = next = null;
		}
	}
	
	public boolean isEmpty() {
		return entry == null;
	}
	
	public int size() {
		return size;
	}
	
	public void add(T e) {
		    ListenEl newElement = new ListenEl(e);
		    if (isEmpty()) {
		        entry = newElement;
		        entry.next = entry;
		        entry.prev = entry;
		    } else {
		        ListenEl last = entry.prev;
		        newElement.next = entry;
		        newElement.prev = last;
		        entry.prev = newElement;
		        last.next = newElement;
		    }
		    size++;
		}




	
	public T remove () {
		if (isEmpty()) {
			throw new NoSuchElementException("RDVL ist leer");
		} else {
			T r = entry.data;
			entry.prev.next = entry.next;
			entry.next.prev = entry.prev;
			entry = entry.next;
			size--;
			return r;
		}
	}
	
	public T element () {
		if (isEmpty()) {
			throw new NoSuchElementException("RDVL ist leer");
		}
		return entry.data;
	}
	
	public void next (int s) {
	    if (isEmpty()) {
	        throw new NoSuchElementException("RDVL ist leer");
	    }
	    for (int i = 0; i < s; i++) {
	        entry = entry.next;
	    }
	}

	
	public void prev (int s) {
		if (isEmpty()) {
			throw new NoSuchElementException("RDVL ist leer");
		}
		for (int i = 0; i < s; i++) {
			entry = entry.prev;
		}
	}
	
}
