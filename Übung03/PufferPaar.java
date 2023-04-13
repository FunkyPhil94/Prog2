
public class PufferPaar {

	public static void main(String[] args) {

		int maxGroesse = 10;
		Puffer<Paar<Student, String>> servicePoint = new SchlangeMitArray<>(maxGroesse);
		
		Puffer<Paar<Boxer,Boxer>> boxEvent = new StapelMitArray <> (maxGroesse);
		
		Student s1 = new Student ("Tim","Becker", 904888);
		Student s2 = new Student ("Hans","Müller", 904889);
		Student s3 = new Student ("Justin","Schmitz", 904890);
		Student s4 = new Student ("Peter","Frido", 904891);
		
		Boxer b1 = new Boxer ("Ali", "Muhammad", 100);
		Boxer b2 = new Boxer ("Tyson", "Mike", 120);
		Boxer b3 = new Boxer ("Foreman", "George", 110);
		Boxer b4 = new Boxer ("Balboa", "Rocky", 110);
		Boxer b5 = new Boxer ("Drago", "Ivan", 110);
		Boxer b6 = new Boxer ("Creed", "Apollo", 110);

		
		servicePoint.insert(new Paar<> (s1, "Wie funktioniert JUnit?"));
		servicePoint.insert(new Paar<> (s2, "Wann fängt der Kampf an?"));
		servicePoint.insert(new Paar<> (s3, "Wer ist der beste Boxer?"));
		servicePoint.insert(new Paar<> (s4, "Wo ist das Klo?"));
		
		boxEvent.insert(new Paar<> (b1,b2));
		boxEvent.insert(new Paar<> (b3,b4));
		boxEvent.insert(new Paar<> (b5,b6));

        System.out.println("Fragen im ServicePoint:");
        while (!servicePoint.isEmpty()) {
            Paar<Student, String> paar = servicePoint.remove();
            System.out.println(paar.getErstes() + " fragt: " + paar.getZweites());
        }
        
        System.out.println("\nBoxkämpfe am Abend:");
        while (!boxEvent.isEmpty()) {
            Paar<Boxer, Boxer> paar = boxEvent.remove();
            System.out.println(paar.getErstes() + " vs. " + paar.getZweites());
        }
	}

}
