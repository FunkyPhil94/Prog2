import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RingpufferTest {

	private Ringpuffer <Integer> array;
	
	@BeforeEach
	void setUp() throws Exception {
		array = new Ringpuffer<>(4);
	}

	@Test
	void testAddFirstAddLastSetGetX() {
		
     assertThrows(IndexOutOfBoundsException.class, () -> array.get(-1));

		array.addFirst(1);
		assertEquals(1,array.size());
//		assertEquals(0,array.start());
//		assertEquals(0,array.ende());
		
		array.addFirst(2);
		assertEquals(2,array.size());
//		assertEquals(0,array.start());
//		assertEquals(1,array.ende());

		array.addLast(3);
		assertEquals(3,array.size());
//		assertEquals(2,array.start());
//		assertEquals(2,array.ende());

		assertEquals(3,array.get(0));
		assertEquals(null,array.get(1));
		assertEquals(2,array.get(2));
		assertEquals(null,array.set(1, 99));
		assertEquals(99,array.get(1));
//        assertThrows(IndexOutOfBoundsException.class, () -> array.set(20, 5));
	}
	
	@Test
	void testRemoveFirstRemoveLastSize() {
      assertThrows(NoSuchElementException.class, () -> array.removeFirst());

		array.addFirst(1);
		array.addFirst(2);

		assertEquals(2,array.removeFirst());
		
		assertEquals(1,array.size());
//		assertEquals(1,array.start());
//		assertEquals(1,array.ende());
		
		array.addFirst(3);
		
		assertEquals(2,array.size());
//		assertEquals(1,array.start());
//		assertEquals(2,array.ende());
		
		assertEquals(3,array.get(0));
		assertEquals(1,array.get(1));
	
		array.addFirst(4);
		
		assertEquals(3,array.size());
	}


}
