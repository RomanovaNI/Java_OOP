
package tests;


import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.*;

public class TestSets {
    HashSet<Integer> setInt;
    Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};


    @Before
    public void setUp() throws Exception {
        setInt = new HashSet<Integer>(Arrays.asList(arNumbers));
    }

    @Test
    public void testAdd() {
        assertTrue(setInt.add(null));
        assertEquals(arNumbers.length, setInt.size());  //double 10

        assertTrue(setInt.add(100500));
        assertEquals(arNumbers.length + 1, setInt.size());
        assertTrue(setInt.contains(100500));
        Iterator iter = setInt.iterator();
        //  assertEquals(100500,iter.next()); //kak obratitya po index?


    }

    @Test
    public void testContains() {
        assertTrue(setInt.contains(10));
        assertFalse(setInt.contains(-10));

    }

    @Test
    public void testSize() {
        assertEquals(arNumbers.length - 1, setInt.size()); //double 10
        setInt.add(null);
        assertEquals(arNumbers.length, setInt.size());
        setInt.add(303);
        assertEquals(arNumbers.length + 1, setInt.size());

    }

    @Test
    public void testRemove() {
        assertTrue(setInt.remove(10));
        assertEquals(arNumbers.length - 2, setInt.size());
        assertTrue(setInt.removeAll(setInt));
        assertTrue(setInt.isEmpty());
    }

    @Test
    public void testClear() {

        setInt.clear();
        assertTrue(setInt.isEmpty());
        assertEquals(0, setInt.size());

    }
}
