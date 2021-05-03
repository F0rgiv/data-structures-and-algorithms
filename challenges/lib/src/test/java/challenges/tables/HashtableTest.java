package challenges.tables;

import challenges.ArrayShift;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void add() {
        Hashtable<String> testTable0 = new Hashtable<>();
        testTable0.add("val1", "test1");
        testTable0.add("val2", "test2");
        assertTrue(testTable0.contains("val1"));
        assertTrue(testTable0.contains("val2"));
        assertEquals("test1",testTable0.get("val1"));
        assertEquals("test2",testTable0.get("val2"));
        testTable0.add("val1", "test3");
        assertTrue(testTable0.contains("val1"));
        assertTrue(testTable0.contains("val2"));
        assertEquals("test3",testTable0.get("val1"));
        assertEquals("test2",testTable0.get("val2"));
        assertNull(testTable0.get("Does Not Exist"));

        Hashtable<String> testTable1 = new Hashtable<>(50);
        testTable1.add("val1", "test1");
        testTable1.add("val2", "test2");
        assertTrue(testTable1.contains("val1"));
        assertTrue(testTable1.contains("val2"));
        assertEquals("test1",testTable1.get("val1"));
        assertEquals("test2",testTable1.get("val2"));
        testTable1.add("val1", "test3");
        assertTrue(testTable1.contains("val1"));
        assertTrue(testTable1.contains("val2"));
        assertEquals("test3",testTable1.get("val1"));
        assertEquals("test2",testTable1.get("val2"));
        assertNull(testTable0.get("Does Not Exist"));
    }
}