import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListTests {
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> temp = new ArrayList<>();

    //      list.add("Sharik");
    //      list.add("Zuchka");

    @Test
    public void testAdd() {
        assertTrue(list.add("Bobik"));
        //assertFalse(list.add(null)); why null is allow?

    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());
        list.add("Sharik");
        list.add("Zuchka");
        assertEquals(2, list.size());
        assertNotEquals(-1, list.size());

    }

    @Test
    public void testIsEmpty() {
        list.add("Sharik");
        list.add("Zuchka");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testAddAll() {
        list.add("Sharik");
        list.add("Zuchka");
        temp.add("1");
        temp.add("2");
        temp.add("3");
        assertTrue(list.addAll(temp));
        assertTrue(list.addAll(0, temp));

    }

    @Test
    public void testIndexOf() {
        list.add("Sharik");
        list.add("Zuchka");
        temp.add("1");
        temp.add("2");
        temp.add("3");
        list.add("Drugok");
        list.add("Sharik");
        list.add("Snegok");
        assertTrue(list.addAll(1, temp));
        assertEquals(0, list.indexOf("Sharik"));
        assertNotEquals(6, list.indexOf("Sharik"));

    }

    @Test
    public void testLastIndexOf() {
        list.add("Sharik");
        list.add("Zuchka");
        temp.add("1");
        temp.add("2");
        temp.add("3");
        list.add("Drugok");
        list.add("Sharik");
        list.add("Snegok");
        assertTrue(list.addAll(1, temp));
        assertNotEquals(0, list.lastIndexOf("Sharik"));
        assertEquals(6, list.lastIndexOf("Sharik"));

    }

    @Test
    public void testContains() {
        list.add("Sharik");
        list.add("Zuchka");
        temp.add("1");
        temp.add("2");
        temp.add("3");
        list.add("Drugok");
        list.add("Sharik");
        list.add("Snegok");
        assertTrue(list.addAll(1, temp));
        assertTrue(list.contains("Snegok"));
        assertFalse(list.contains("bob"));
    }

    @Test
    public void testRemove() {
        list.add("Sharik");
        list.add("Zuchka");
        temp.add("1");
        temp.add("2");
        temp.add("3");
        list.add("Drugok");
        list.add("Sharik");
        list.add("Snegok");
        assertTrue(list.addAll(1, temp));
        assertEquals(8, list.size());
        assertTrue(list.remove("Sharik"));
        assertFalse(list.remove("bob"));
        assertEquals(7, list.size());
        // assertTrue(list.remove((Integer) 3));  ne poluchilos
       // assertTrue(list.remove(3));  ne poluchilos

       // assertEquals(6, list.size());

    }@Test
    public void testRemoveAll() {
        list.add("Sharik");
        list.add("Zuchka");
        temp.add("1");
        temp.add("2");
        temp.add("3");
        list.add("Drugok");
        list.add("Sharik");
        list.add("Snegok");
        assertTrue(list.addAll(1, temp));
        assertEquals(8, list.size());
        assertTrue(list.removeAll(temp));
        assertEquals(5, list.size());
    }@Test
    public void testClear() {
        list.add("Sharik");
        list.add("Zuchka");
        temp.add("1");
        temp.add("2");
        temp.add("3");
        list.add("Drugok");
        list.add("Sharik");
        list.add("Snegok");
        assertTrue(list.addAll(1, temp));
        assertEquals(8, list.size());
        list.clear();
       // assertTrue(list.clear());
       //assertEquals(true, list.clear(); ne poluchilos
        assertTrue(list.isEmpty());

    }

}
