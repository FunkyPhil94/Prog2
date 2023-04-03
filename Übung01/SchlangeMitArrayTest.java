package aufgabe2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchlangeMitArrayTest {
	
	SchlangeMitArray t = null;
	static int a [] = {1,2,3,4,5};
	int w = 6;
	
	
	@BeforeEach
	void setUp(){
		t = new SchlangeMitArray(5);
	}

	@AfterEach
	void tearDown() {
		t = null;
	}

	@Test
	void testSizeCapacity () {
		
		int s = 0;
		for (int i:a) {
		assertEquals(t.size(), s, "Größe falsch");
		assertEquals(t.capacity(), t.array.length, "nicht leer" );
		}
	}
	
	void testInsertRemove() {
		for (int i:a) {
			t.insert(i);
//			assertEquals(t.insert(i), t.array.length, "Falsche Posi");
			assertEquals(i, t.remove(), "Nichts da");
		}
	}
	
	//Test auf IllegalStateException bei insert
		@Test
		void testInsertISE() {
			SchlangeMitArray n = new SchlangeMitArray(0);
			assertThrows(IllegalStateException.class, () -> n.insert(w), "no ISE?");
		}
		
		//Test auf NoSuchElementException bei remove
		@Test
		void testRemoveNSEE () {
			assertThrows(NoSuchElementException.class, () -> t.remove(), "no NSEE?");
		}

		//Test auf NoSuchElementException bei front
		@Test
		void testFrontNSEE () {
			assertThrows(NoSuchElementException.class, () -> t.front(), "no NSEE?");
		}

}
