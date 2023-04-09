
public class Euler {
	
	
	
	public static int Vielfaches (int range) {
		int summe = 0;
		for (int i = 1; i < range; i++ ) {
			if (i%3 == 0 || i%5 == 0) {
				summe += i;
			}
		}
		
		return summe;
	}

}
