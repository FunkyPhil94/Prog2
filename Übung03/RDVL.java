
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
		int s = 0;
		if (entry == null) {
			return s;
		}
		if (entry != null) {
			ListenEl current = entry;
			do {
				size++;
				current = current.next;
			}while (current != entry);
		}
		return s;
	}
	
	public void add (T e) {
	    ListenEl newElement = new ListenEl(e);
		if(isEmpty()) {
			entry = newElement;
			entry.next = entry;
			entry.prev = entry;
		} else {
			entry.prev.next = newElement;
			newElement.next = entry;
			newElement.prev = entry.prev;
	        entry.prev.next = newElement;
		}
	}
	
	public T remove () {
		if (isEmpty()) {
			return null;
		} else {
			T r = entry.data;
			entry.prev.next = entry.next;
			entry.next.prev = entry.prev;
			entry = entry.next;
			return r;
		}
	}
	
	public T element () {
		if (isEmpty()) {
			return null;
		}
		return entry.data;
	}
	
	public void next (int s) {
		for (int i = 0; i < s; i++) {
			entry = entry.next;
		}
	}
	
	public void prev (int s) {
		for (int i = 0; i < s; i++) {
			entry = entry.prev;
		}
	}
	
}
