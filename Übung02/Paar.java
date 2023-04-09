import java.util.Objects;

public class Paar <E,Z>{
	
    E erstes;
    Z zweites;

    public Paar(E erstes, Z zweites) {
        this.erstes = erstes;
        this.zweites = zweites;
    }
	
    public E getErstes() {
    	return erstes;
    }
    
    public Z getZweites() {
    	return zweites;
    }
    
    public E setErstes(E e) {
    	E temp = erstes;
    	erstes = e;
    	e = temp;
    	return e;
    }
    
    public Z setZweites (Z z) {
    	Z temp = zweites;
    	zweites = z;
    	z = temp;
    	return z;
    }
    
    public  void setBeide (E e, Z z) {
    	erstes = e;
    	zweites = z;
    }
    
    public boolean equals(Paar <E,Z> p) {
    	if (p == null) return false;
    	if (this == p) return true;
    	if (getClass() != p.getClass()) return false;
    	Paar<E,Z> objekt = (Paar<E,Z>) p;
    	return Objects.equals(objekt.erstes, erstes) && Objects.equals(objekt.zweites, zweites);	
    }
    
    
    public String toString() {
    	return "(" +  erstes + "," + zweites + ")"; 
    }
}
