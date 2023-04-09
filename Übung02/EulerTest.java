import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EulerTest {

	
	@Test
	void testVielfaches() {
		assertEquals(23, Euler.Vielfaches(10) );
		assertEquals(233168, Euler.Vielfaches(1000));
	}


}
