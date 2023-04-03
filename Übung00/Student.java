

class Student extends Person {

	private int matrikelnummer;
	
	public Student(String name, String vorname, int matrikelnummer) {
		super(name, vorname);
		this.matrikelnummer = matrikelnummer;
		// TODO Auto-generated constructor stub
	}
	
	public int getMatrikel() {
		return matrikelnummer;
	}

	public String toString() {
		return super.toString() + " " + matrikelnummer;
	}
	
	public boolean equals (Object o) {
		
		if (this == o) return true;
		if (!(o instanceof Student)) return false;
		if (!super.equals(o)) return false;
		Student student = (Student) o;
		return matrikelnummer == student.matrikelnummer;
		
	}
 }
