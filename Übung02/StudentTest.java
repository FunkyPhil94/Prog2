

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

	private Student s;
	private Student s2;
	
	@BeforeEach
	void setUp(){
		s = new Student("Juan","Sun", 904666);
		s2 = new Student("Juan","Sun", 904666);

	}

	@AfterEach
	void tearDown() throws Exception {
		s = null;
		s2 = null;
	}

	@Test
	void testReflexivitaet() {
//		Student s = new Student ("Juan", "Sun", 904666);
		assertTrue(s.equals(s));
	}
	@Test
	void testSymmetrie() {
//		Student s = new Student ("Juan", "Sun", 904666);
//		Student s2 = new Student ("Juan", "Sun", 904666);
		assertTrue(s.equals(s2) && s2.equals(s));
	}
	
	@Test
	void testTransitivitaet() {
//		Student s = new Student ("Juan", "Sun", 904666);
//		Student s2 = new Student ("Juan", "Sun", 904666);
		Student s3 = new Student ("Juan", "Sun", 904666);
		
		assertTrue(s.equals(s2) && s2.equals(s3) && s.equals(s3));

	}
	
	@Test
	void testKonsistenz() {
//		Student s = new Student ("Juan", "Sun", 904666);
//		Student s2 = new Student ("Juan", "Sun", 904666);
		
		int z = 5;
		for (int i = 0; i < z; i++) {
			assertTrue(s.equals(s2));
		}

	}
	
	@Test
	void testNull() {
		Student s = new Student ("Juan", "Sun", 904666);
		
		assertFalse(s.equals(null));
	}

}

