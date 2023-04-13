

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoxerTest {

	private Boxer boxer;
	private Boxer boxer2;
	
	@BeforeEach
	void setUp() {
		boxer = new Boxer("Tyson", "Mike", 120);
		boxer2 = new Boxer("Tyson", "Mike", 120);
	}

	@AfterEach
	void tearDown() {
		boxer = null;
		boxer2 = null;
	}

	@Test
	void testReflexivitaet() {

		assertTrue(boxer.equals(boxer));
	}
	
	void testSymmetrie() {

		assertTrue(boxer.equals(boxer2) && boxer2.equals(boxer));
	}
	
	void testTransitivitaet() {

		Boxer mike3 = new Boxer("Tyson", "Mike", 120);
		
		assertTrue(boxer.equals(boxer2) && boxer2.equals(mike3) && boxer.equals(mike3));

	}
	
	void testKonsistenz() {

		
		int z = 5;
		for (int i = 0; i < z; i++) {
			assertTrue(boxer.equals(boxer2));
		}

	}
	
	void testNull() {

		
		assertFalse(boxer.equals(null));
	}

}
