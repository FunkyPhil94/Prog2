import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaarTest {
	
	

	@BeforeEach
	void setUp() {
	}

	@AfterEach
	void tearDown(){
	}

	@Test
	void testSetErstesGetErstes() {
		Paar <Integer,String> paar = new Paar <>(99,"Test");
		assertEquals((Integer) 99, paar.getErstes());
		assertEquals((String) "Test", paar.getZweites());
		assertEquals((Integer) 99, paar.setErstes(11));
		assertEquals((Integer) 11, paar.getErstes());
		
	}
	
	@Test
	void testSetZweitesGetZweites() {
		Paar <Integer,String> paar = new Paar <>(99,"Test");
		assertEquals((Integer) 99, paar.getErstes());
		assertEquals((String) "Test", paar.getZweites());
		assertEquals((String) "Test", paar.setZweites("Prog2"));
		assertEquals((String) "Prog2", paar.getZweites());
	}
	
	void testSetBeide() {
		Paar <Integer,String> paar = new Paar <>(99,"Test");
		paar.setBeide(11, "Prog2");
		assertEquals((Integer) 23, paar.erstes);
		assertEquals((String) "Prog2", paar.zweites);
	}
	
	void testEquals () {
		Paar <Integer,String> paar1 = new Paar <>(99,"Test");
		Paar <Integer,String> paar2 = new Paar <>(99,"Test");
		Paar <Integer,String> paar3 = new Paar <>(11,"Prog2");
		assertTrue(paar1.equals(paar2));
		assertFalse(paar1.equals(paar3));
		assertFalse(paar2.equals(paar3));
	}

	void testStringtoString() {
		Paar <Integer,String> paar = new Paar <>(99,"Test");
		assertEquals((String)"99,Test", paar.toString());
	}
}
