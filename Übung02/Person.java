

abstract class Person {

	private String vorname;
	private String name;
	
	public Person (String name, String vorname) {
		this.name = name;
		this.vorname = vorname;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString () {
		return name + ", " + vorname;
	}
	
	public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                vorname.equals(person.vorname);
	}
	
}
