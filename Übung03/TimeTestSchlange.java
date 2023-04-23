
public class TimeTestSchlange {

	public static void main(String[] args) {
			
		SchlangeMitArray<Integer> array = new SchlangeMitArray <Integer>(100000);
		
		SchlangeMitEVL<Integer> list = new SchlangeMitEVL<Integer>();
	
		long start, finish, elapsed;
		

		
		start = System.currentTimeMillis();
		for (int i = 1; i<= 100000; i++) {
			array.insert(i);
		//	list.insert(i);
		}
		finish = System.currentTimeMillis();
		elapsed = finish - start;
		System.out.println(elapsed);

		
		start = System.currentTimeMillis();
		for (int i = 1; i<= 100000; i++) {
			//array.insert(i);
			list.insert(i);
		}
		finish = System.currentTimeMillis();
		elapsed = finish - start;
		System.out.println(elapsed);
	
	}

}
