class Boxer extends Person{

	private int gewicht;
	
	public Boxer(String name, String vorname, int gewicht) {
		super(name, vorname);
		this.gewicht = gewicht;
		// TODO Auto-generated constructor stub
	}
	
	public int getGewicht() {
		return gewicht;
	}
	
	public String toString() {
		return super.toString() + " " + gewicht + "kg";
	}

	public boolean equals (Object o) {
		
		if (this == o) return true;
		if (!(o instanceof Boxer)) return false;
		if (!super.equals(o)) return false;
		Boxer boxer = (Boxer) o;
		return gewicht == boxer.gewicht;
		
	}
	
}
