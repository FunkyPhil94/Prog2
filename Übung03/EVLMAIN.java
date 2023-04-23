
public class EVLMAIN {

	public static void main(String[] args) {
		
		EVL <Integer> list = new EVL <> ();
		EVL <Integer> list2 = new EVL <> ();

		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		
		list.addFirst(7);
		list.addFirst(1);
		list.addFirst(4);

		
		list2.addFirst(6);
		list2.addFirst(8);
		list2.addFirst(2);
		list2.addFirst(5);
		list2.addFirst(3);
		
		System.out.println(list.toString());
		System.out.println(list2.toString());


		list.zip(list2);
		
//		System.out.println(list.getX(2));
//		System.out.println(list.getNext(2));
//		System.out.println(list.getFirst());


		System.out.println(list.toString());
		
//		System.out.println(list.size);
		
//		System.out.print(list.contains(15));


//		
//		System.out.println(list.removeLast());
//		System.out.println(list.removeLast());
//		System.out.println(list.removeLast());
//		System.out.println(list.removeLast());

		
		
//		System.out.println(list.removeFirst());
//		System.out.println(list.removeFirst());
//		System.out.println(list.removeFirst());
//		System.out.println(list.removeFirst());
		
	}

}
