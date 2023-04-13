import static org.junit.Assert.*;
import org.junit.Test;
import java.util.NoSuchElementException;

public class SchlangeMitEVLTest2 {
  
	
	
	
  @Test
  public void testIsEmpty() {
    SchlangeMitEVL<String> schlange = new SchlangeMitEVL<>();
    assertTrue(schlange.isEmpty());
    schlange.insert("A");
    assertFalse(schlange.isEmpty());
  }
  
  @Test
  public void testInsertAndremove() {
    SchlangeMitEVL<Integer> schlange = new SchlangeMitEVL<>();
    schlange.insert(1);
    schlange.insert(2);
    assertEquals(1, (int) schlange.remove());
    assertEquals(2, (int) schlange.remove());
    assertTrue(schlange.isEmpty());
  }
  
 @Test
  public void testFront() {
      SchlangeMitEVL<String> schlange = new SchlangeMitEVL<>();
      assertTrue(schlange.isEmpty());
      schlange.insert("A");
      schlange.insert("B");
      assertEquals("A", schlange.front());
      assertEquals("A", schlange.front());
  }

  
  @Test(expected = NoSuchElementException.class)
  public void testremoveWithEmptyQueue() {
    SchlangeMitEVL<Double> schlange = new SchlangeMitEVL<>();
    schlange.remove();
  }
  
  @Test(expected = NoSuchElementException.class)
  public void testFrontWithEmptyQueue() {
    SchlangeMitEVL<Object> schlange = new SchlangeMitEVL<>();
    schlange.front();
  }
  
  @Test
  public void testSize() {
    SchlangeMitEVL<Integer> schlange = new SchlangeMitEVL<>();
    assertEquals(0, schlange.size());
    schlange.insert(1);
    schlange.insert(2);
    assertEquals(2, schlange.size());
    assertEquals(2, schlange.size());
  }
  
  @Test
  public void testCapacity() {
    SchlangeMitEVL<String> schlange = new SchlangeMitEVL<>();
    assertEquals(Integer.MAX_VALUE, schlange.capacity());
  }
  
}
