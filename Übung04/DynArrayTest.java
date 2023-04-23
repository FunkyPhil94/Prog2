import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DynArrayTest {

	private DynArray <Integer> array;
	
	@BeforeEach
	void setUp() throws Exception {
		array = new DynArray<>();
	}

	@Test
	void testAddFirstAddLastSetGetX() {
		array.addFirst(1);
		array.addFirst(2);
		array.addFirst(3);
		array.addLast(4);
		array.addLast(5);

		assertEquals(3,array.get(0));
		assertEquals(5,array.get(4));
		assertEquals(3,array.set(0, 99));
		assertEquals(99,array.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> array.set(20, 5));
	}
	
	@Test
	void testRemoveFirstRemoveLast() {
		array.addFirst(1);
		array.addFirst(2);
		array.addFirst(3);
		array.addFirst(4);
		array.addFirst(5);
		
		assertEquals(1,array.get(4));
		assertEquals(5,array.removeFirst());
		assertEquals(1,array.removeLast());
		assertEquals(4,array.get(0));
		assertEquals(3,array.get(1));
		assertEquals(2,array.get(2));
		assertEquals(1,array.get(3));
        assertThrows(IndexOutOfBoundsException.class, () -> array.get(4));	
	}
	
	@Test
	void testSizeCapacity() {
		assertEquals(0,array.size());
		assertEquals(1,array.capacity());
		array.addFirst(1);
		assertEquals(1,array.size());
		assertEquals(1,array.capacity());
		array.addFirst(1);
		assertEquals(2,array.size());
		assertEquals(2,array.capacity());
		array.addFirst(1);
		assertEquals(3,array.size());
		assertEquals(4,array.capacity());
		
		
		array.removeFirst();
		assertEquals(2,array.size());
		assertEquals(4,array.capacity());
		array.removeFirst();
		assertEquals(1,array.size());
		assertEquals(2,array.capacity());
		array.removeFirst();
		assertEquals(0,array.size());
		assertEquals(1,array.capacity());
	}

}
