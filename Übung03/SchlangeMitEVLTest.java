import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchlangeMitEVLTest {

	
	Schlange <Integer> integer;
	Schlange <String> string;
	@BeforeEach
	void setUp(){
		integer = new SchlangeMitEVL <>();
		string = new SchlangeMitEVL <>();
	}

	@Test
	void testSizeCapacity () {
		integer.insert(1);
		integer.insert(2);
		integer.insert(3);
		assertEquals(integer.size(), 3, "Größe falsch");
		assertEquals(Integer.MAX_VALUE, integer.capacity(), "nicht leer" );
	}
	
	@Test
	void testInsertRemoveIsEmpty() {
		assertTrue(integer.isEmpty());
		integer.insert(1);
		assertFalse(integer.isEmpty());
	    assertEquals(1,integer.remove());	    		
	}



	
	
	//Test auf IllegalStateException bei insert
		@Test
		void testInsertISE() {
			assertThrows(IllegalStateException.class, () -> integer.insert(1), "no ISE?");
		}
		
		//Test auf NoSuchElementException bei remove
		@Test
		void testRemoveNSEE () {
			assertThrows(NoSuchElementException.class, () -> integer.remove(), "no NSEE?");
		}

		//Test auf NoSuchElementException bei front
		@Test
		void testFrontNSEE () {
			assertThrows(NoSuchElementException.class, () -> integer.front(), "no NSEE?");
		}

}
