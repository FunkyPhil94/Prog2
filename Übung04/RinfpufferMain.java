
public class RinfpufferMain {

	public static void main(String[] args) {
		
		int capacity = 4;
		Ringpuffer <Integer> array = new Ringpuffer<>(4);
		
		array.addFirst(1);
		array.addFirst(2);
//		array.addFirst(3);
//		array.addFirst(4);

		for(int i = 0; i < 4;i++) {
			System.out.println(array.get(i));
		}
		
		System.out.println();
		
		System.out.println(array.start);
		System.out.println(array.ende);
		
		System.out.println();

		
		System.out.println(array.removeFirst());
		
		System.out.println();

		System.out.println(array.start);
		System.out.println(array.ende);
		
		System.out.println();

		array.addFirst(3);
		
//		System.out.println(array.size);
//
//		System.out.println();

		
		for(int i = 0; i < 4;i++) {
			System.out.println(array.get(i));
		}


	}

}
