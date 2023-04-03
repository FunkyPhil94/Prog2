package aufgabe2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StapelMitArrayTest {
	

	StapelMitArray t = null;
	static int a [] = {1,2,3,4,5};
	static int w = 6;

	@BeforeEach
	void setUp() {
		t = new StapelMitArray(5);
	}

	@AfterEach
	void tearDown() {
		t = null;
	}

	@Test
	void testIsEmptySizeCapacity() {
		int s = 0;
		for (int i = 0; i <= a.length ; i++) {
			assertEquals(t.isEmpty(), t.array.length != 0, "Ist nicht leer");
			assertEquals(t.size(), s, "Größe stimmt nicht");
			assertEquals(t.capacity(), t.array.length, "Kapazität falsch");
			
		}
	}
	
	@Test
	void testInsertRemove() {
		for (int i = 0; i <= a.length ; i++) {
			t.insert(i);
//			assertEquals(t.insert(i), t.array.length, "Falsche Posi");
			assertEquals(i, t.remove(), "Nichts da");
		}
	}
	
	//Test auf IllegalStateException bei insert
	@Test
	void testInsertISE() {
		StapelMitArray n = new StapelMitArray(0);
		assertThrows(IllegalStateException.class, () -> n.insert(w), "no ISE?");
	}
	
	//Test auf NoSuchElementException bei remove
	@Test
	void testRemoveNSEE () {
		assertThrows(NoSuchElementException.class, () -> t.remove(), "no NSEE?");
	}

	//Test auf NoSuchElementException bei top
	@Test
	void testTopNSEE () {
		assertThrows(NoSuchElementException.class, () -> t.top(), "no NSEE?");
	}
	
	@Test
	void testApplyToAll() {
		StapelMitArray Stapel = new StapelMitArray(5);
		for (int i:a) {
			Stapel.insert(i);
		}
		
		Stapel.applyToAll(wert -> wert *2);
		assertEquals(10, Stapel.remove());
		assertEquals(8, Stapel.remove());
		assertEquals(6, Stapel.remove());
		assertEquals(4, Stapel.remove());
		assertEquals(2, Stapel.remove());
		
		for (int i:a) {
			Stapel.insert(i);
		}
		
		Stapel.applyToAll(wert -> wert * wert);
		assertEquals(25, Stapel.remove());
		assertEquals(16, Stapel.remove());
		assertEquals(9, Stapel.remove());
		assertEquals(4, Stapel.remove());
		assertEquals(1, Stapel.remove());
		
	}
 }
