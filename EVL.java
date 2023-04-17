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
	
	public T getX (int z) {
		ListenEl current = first;
		for (int i = 1; i < z; i++) {
			current = current.next;
		}
		
		return current.data;
	}
	public T getNext (int z) {
		ListenEl current = first;
		for (int i = 1; i < z; i++) {
			current = current.next;
		}
		
		return current.next.data;
	}
	
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
		return size;	
	}
	
	public String toString(){ 
		ListenEl current = first;
		if(current == null) { 
			return "";
		}
		String s = "" + current.data;
		while (current.next != null) {
			s += "-" + current.next.data.toString();
			current = current.next;
		}
		return s;
	}	
	
	public void zip(EVL<T> other) {
	    if (other.size() == 0) {
	        return;
	    }

	    ListenEl currentThis = first;
	    ListenEl currentOther = other.first;
	    ListenEl currentOther2 = null;

	    while (currentThis != null && currentOther != null) {
	        ListenEl nextThis = currentThis.next;
	        ListenEl nextOther = currentOther.next;

	        currentThis.next = currentOther;
	        currentOther.next = nextThis;

	        currentOther2 = currentOther;
	        currentThis = nextThis;
	        currentOther = nextOther;
	    }

	    if (currentThis == null && currentOther2 != null) {
	    	currentOther2.next = currentOther;
	    }

	    size += other.size();
	    other.first = null;
	    other.size = 0;
	}
	
	public void zip2(EVL<T> other) {
	    if (other.size() == 0) {
	        return;
	    }


	    T r = null;
	    while (this.first != null && other.first != null) {        
	    	this.first.next = other.first;
	        other.first.next = this.first.next;

	        r = other.first.data;
	        this.first = this.first.next;
	        other.first = other.first.next;
	    }
	    if (this.first == null && r != null) {
	    	other.first.next = other.first;
	    }

	    size += other.size();
	    other.first = null;
	    other.size = 0;
	}



}
