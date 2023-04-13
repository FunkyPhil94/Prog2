

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
	void testInsertRemoveInteger() {
		for (int i = 0; i <= a.length ; i++) {
			t.insert(i);
			assertEquals(i, t.remove(), "Nichts da");
		}
	}
	
	void testInsertRemoveChar() {
		for (int i = 0; i <= a.length ; i++) {
			t.insert((char)i+96);
			assertEquals((char)i +96, t.remove(), "Nichts da");
		}
	}
	
	void testTopInteger() {
		StapelMitArray<Integer> Stapel = new StapelMitArray<Integer>(5); 
		Stapel.insert(1);
		Stapel.insert(2);
		assertEquals(2, Stapel.top(), "Nichts da");
	}
	
	void testTopChar() {		
		StapelMitArray<Character> Stapel = new StapelMitArray<Character>(5); 
		Stapel.insert('a');
		Stapel.insert('b');
		assertEquals('b',  Stapel.top(), "Nichts da");
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
	void testApplyToAllInteger() {
		StapelMitArray<Integer> Stapel = new StapelMitArray <>(5);
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
	
	@Test
	void testApplyToAllChar() {
		StapelMitArray<Character> Stapel = new  StapelMitArray <>(5);
		for (int i = 0; i < a.length; i++) {
			Stapel.insert((char)(i + 96));
		}
		
		Stapel.applyToAll(wert -> (char) (wert+1));
		assertEquals('e', Stapel.remove());
		assertEquals('d', Stapel.remove());
		assertEquals('c', Stapel.remove());
		assertEquals('b', Stapel.remove());
		assertEquals('a', Stapel.remove());
		
		for (int i = 0; i < a.length; i++) {
			Stapel.insert((char)(i + 97));
		}
		
		Stapel.applyToAll(wert -> (char)(wert - 32));
		assertEquals('E', Stapel.remove());
		assertEquals('D', Stapel.remove());
		assertEquals('C', Stapel.remove());
		assertEquals('B', Stapel.remove());
		assertEquals('A', Stapel.remove());
		
	}
	
	@Test
	void testApplyToAllString() {
		StapelMitArray<String> Stapel = new StapelMitArray <>(5);
		for (int i = 0; i < a.length; i++) {
			Stapel.insert("String" + i);
		}
		
		Stapel.applyToAll(wert -> wert.toUpperCase());
		assertEquals("STRING4", Stapel.remove());
		assertEquals("STRING3", Stapel.remove());
		assertEquals("STRING2", Stapel.remove());
		assertEquals("STRING1", Stapel.remove());
		assertEquals("STRING0", Stapel.remove());
		
		for (int i = 0; i < a.length; i++) {
			Stapel.insert("String" + i);
		}
		
		int[] count = {1};
		Stapel.applyToAll(wert -> wert.substring(0, count[0]++));
		assertEquals("Strin", Stapel.remove());
		assertEquals("Stri", Stapel.remove());
		assertEquals("Str", Stapel.remove());
		assertEquals("St", Stapel.remove());
		assertEquals("S", Stapel.remove());
		
		
//		for (int i = 0; i < a.length; i++) {
//			 final int count = a.length -i;
//			
//			Stapel.applyToAll(wert -> wert.substring(0,count));
//		}
//        assertEquals("S", Stapel.remove());
//        assertEquals("St", Stapel.remove());
//        assertEquals("Str", Stapel.remove());
//        assertEquals("Stri", Stapel.remove());
//        assertEquals("Strin", Stapel.remove());
	}
 }
