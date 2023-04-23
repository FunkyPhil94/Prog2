import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

public class RDVLTest {

    private RDVL<Integer> test;

    @Before
    public void setUp() {
        test = new RDVL<Integer>();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(test.isEmpty());
        test.add(1);
        assertFalse(test.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, test.size());
        test.add(1);
        test.add(2);
        assertEquals(2, test.size());
    }

    @Test
    public void testAdd() {
        test.add(1);
        assertEquals(Integer.valueOf(1), test.element());
        test.add(2);
        assertEquals(Integer.valueOf(1), test.element());
        test.next(1);
        assertEquals(Integer.valueOf(2), test.element());
    }

    @Test
    public void testRemove() {
        test.add(1);
        test.add(2);
        assertEquals(Integer.valueOf(1), test.remove());
        assertEquals(Integer.valueOf(2), test.element());
        assertEquals(1, test.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveEmpty() {
        test.remove();
    }

    @Test
    public void testElement() {
        test.add(1);
        assertEquals(Integer.valueOf(1), test.element());
        test.add(2);
        assertEquals(Integer.valueOf(1), test.element());
    }

    @Test(expected = NoSuchElementException.class)
    public void testElementEmpty() {
        test.element();
    }

    @Test
    public void testNext() {
        test.add(1);
        test.add(2);
        test.next(1);
        assertEquals(Integer.valueOf(2), test.element());
        test.next(1);
        assertEquals(Integer.valueOf(1), test.element());
    }

    @Test(expected = NoSuchElementException.class)
    public void testNextEmpty() {
        test.next(1);
    }

    @Test
    public void testPrev() {
        test.add(1);
        test.add(2);
        test.add(3);
        test.prev(1);
        assertEquals(Integer.valueOf(3), test.element());
        test.prev(1);
        assertEquals(Integer.valueOf(2), test.element());
        test.prev(1);
        assertEquals(Integer.valueOf(1), test.element());
        test.prev(1);
        assertEquals(Integer.valueOf(3), test.element());
    }

    @Test(expected = NoSuchElementException.class)
    public void testPrevEmpty() {
        test.prev(1);
    }

}
