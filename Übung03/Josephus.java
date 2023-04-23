public class Josephus {
	public int loese(int n, int k) {
		RDVL<Integer> jo = new RDVL<>();	
	    for (int i = 1; i <= n; i++) {
	        jo.add(i);
	    }
	    for (int i = 1; i < n; i++) {
	    	jo.next(1);
	    	System.out.println("Weg mit " + jo.element());
	    	jo.remove();
	    }
	    return jo.element();
	}
}

