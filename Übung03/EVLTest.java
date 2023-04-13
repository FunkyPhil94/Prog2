import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EVLTest {
	
	EVL <Integer> integerList;
	EVL <String> stringList;
	
	@BeforeEach
	void setUp(){
		integerList = new EVL <Integer> () ;
		stringList = new EVL <String> ();
	}

	@Test
	void testAddFirstGetFirstGetLast() {
		integerList.addFirst(1);
		integerList.addFirst(2);
		
		assertEquals(2,(int)integerList.getFirst());
		assertEquals(1,(int)integerList.getLast());
		
		stringList.addFirst("Test");
		stringList.addFirst("Hallo");
		
		assertEquals("Hallo",stringList.getFirst());
		assertEquals("Test",stringList.getLast());

	}

	void testRemoveFirstRemoveLast() {
		integerList.addLast(1);
		integerList.addLast(2);
		integerList.addLast(3);
		integerList.addLast(4);

		String e1 = "(2-3)";
		assertEquals(1,(int)integerList.removeFirst());
		assertEquals(4,(int)integerList.removeLast());
		assertEquals(e1, integerList.toString());		
		
		stringList.addFirst("Test");
		stringList.addFirst("Hallo");
		stringList.addLast("Was");
		stringList.addLast("Geht");
		
		assertEquals("Geht",stringList.removeFirst());
		assertEquals("Test",stringList.removeLast());

	}
	
	void testSizeContains() {
		integerList.addFirst(1);
		integerList.addFirst(2);
		integerList.addLast(3);
		integerList.addLast(4);
		
		assertEquals(4,integerList.size());
		assertTrue(integerList.equals(3));
		
		stringList.addFirst("Test");
		stringList.addFirst("Hallo");
		stringList.addLast("Was");
		stringList.addLast("Geht");
		
		assertEquals("Hallo",stringList.size());
		assertTrue(stringList.equals("Was"));
	}
	
	void testToString() {
		integerList.addFirst(1);
		integerList.addFirst(2);
		integerList.addLast(3);
		integerList.addLast(4);
		
		String e1 = "(2-1-3-4)";
		assertEquals(e1, integerList.toString());

		
		stringList.addFirst("Test");
		stringList.addFirst("Hallo");
		stringList.addLast("Was");
		stringList.addLast("Geht");
		
		String e2 = "Hallo-Test-Was-Geht";
		assertEquals(e2, stringList.toString());

	}
}
