public class GenericsFehler{
	public static void main(String[] args){
		MyObject mo = new MyObject(); // erstelle eine MyObject Instanz
		MyGeneric<String> mg = new MyGeneric<>();  // erstelle MyGeneric Instanz mit String Datentyp

		String s1 = "Hallo"; // String mit Wert "Hallo"
		Integer i1 = 42; // Integer mit Wert 42

		mo.set(i1); //setze Objekt il in die MyObject Instanz mo
		mo.set(s1); // Überschreibe il mit s1 
		
		String s2 = (String) mo.get(); /* hole Objekt aus mo, weise es s2 zu,
		muss gecastet werden, da es ein Objekt ist*/
		
		
	        Integer i2 = (Integer) mo.get(); /*hole Objekt aus mo, weise es i2 zu,
	         muss gecastet werden, da es ein Objekt ist, funktioniert nicht,
	          da Objekt in mo ein String ist (Zeile 10)  */
		

		mg.set(s1); // setze Objekt s1 in MyGeneric Instanz mg
		mg.set(i1); /* setze Objekt i1 in MyGeneric Instanz mg, geht aber nicht, 
		da vom Datentyp String*/
		
		String s3 = mg.get(); /* hole Objekt aus mg und weise s3 zu*/
		Integer i3 = (Integer)mg.get(); /* Hole Objekt mg und weise i3 zu,
		muss gecastet werden da von Typ Integer, funktioniert nicht, da Objekt in
		mg ein String ist (Datentyp String)*/
	}
}
}

/** This class is a simplified 'container' for objects of type Object
    thus all subtypes of Object can be stored
    so in Java every kind of type   */
class MyObject{
	private Object o;
	public void set(Object o){
		this.o = o;
	}
	public Object get(){
		return o;
	}
}


/* Benutzt den konkreten Typ Object*/

/** This is a simple container for storing an object of a generic type
    so any given type (and it's subclasses) */
class MyGeneric<T>{
	private T o;
	public void set(T o){
		this.o = o;
	}
	public T get(){
		return o;
	}
}


/* Benutzt generischen Datentyp, muss daher erst zugewiesen werden,
 * wenn eine Instanz von einem bestimmten Datentyp erzeugt wird
 */


