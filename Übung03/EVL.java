import java.util.NoSuchElementException;

class EVL <T>{
	
		ListenEl first = null;
		int size = 0;	//Laenge
		
		class ListenEl{
			T data;		//Inhalt
			ListenEl next;
			
			ListenEl(T o) {
				data = o;
				next = null;
			}
		}
	
	public void addFirst(T o) {
		ListenEl e = new ListenEl(o);
			if(first == null) {
				first = e;
			} else {
				e.next = first; 
				first = e;
			}
		size++;
	}
	
	public T removeFirst(){
		if(null != first) { 
			T r = first.data; 
			first = first.next; 
			size--; 
			return r; 
			} 
		return null;
	}

	
	////////////////////////////////
	
	public T getFirst()throws NoSuchElementException{ 
		if(first == null) { 
			throw new NoSuchElementException("Get First: Liste ist leer");
			}
		return first.data;
		}
	
	public T getLast()throws NoSuchElementException{ 
		if(first == null) { 
			throw new NoSuchElementException("Get Last: Liste ist leer");
			} 
		ListenEl e = first;
		while (e.next != null) {
			e = e.next;
		}
		return e.data;
	}
	
	public void addLast(T o){ 
		ListenEl e = new ListenEl(o);
		if (first == null) {
			first = e;
		} else {
			ListenEl current = first;
			while (current.next != null) {
				current = current.next;
			}
			current.next = e;
		}
		size ++;
	}
	
	public T removeLast()throws NoSuchElementException{ 
		if (first == null) {
			throw new NoSuchElementException("Remove Last: Liste ist leer");
		}
		if(first != null && first.next == null) { 
			T r = first.data; 
			first = null; 
			size--; 
			return r; 
			} 
		ListenEl current = first;
		while (current.next.next != null) {
			current = current.next;
		}
		T r = current.next.data;
		current.next = null;
		size --;
		return r;
	}
	
	public boolean contains(T o){ 
	    ListenEl current = first;
		while (current != null) {
	        if (current.data.equals(o)) {
	            return true;
	        }
	        current = current.next;
	    }
	    return false;
	}
	
	
	public int size(){ 
		int s = size;
//		if(first == null) {  
//			return s; 
//		}
//		while (first != null) {
//			s++;
//			first = first.next;
//		}
		return s;
		
	}
	
	public String toString(){ 
		if(first == null) { 
			return "";
		}
		return "(" + toStringHilfe(first).substring(1) +  ")";
	}
	
	
	private String toStringHilfe(ListenEl first) {
		if (first == null) {
			return "";
		}
		return "-" + first.data.toString() + toStringHilfe(first.next);
	}
	
	
}
