package tests;

import model.MyArray;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayTests {
    MyArray numbers;
    MyArray strings;
    Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
    String[] arStrings = {"abc", "lmn", "fg", "abc"};

    @Before
    public void setUp() throws Exception {
        numbers = new MyArray();
        for (Integer i : arNumbers) {
            numbers.add(i);
        }
        strings = new MyArray();
        for (String s : arStrings) {
            strings.add(s);
            {


            }
        }
    }

    @Test
    public void testSetUp() {
        int sizeNumbers = numbers.size();
        int sizeStrings = strings.size();
        assertEquals(arNumbers.length, sizeNumbers);
        assertEquals(arStrings.length, sizeStrings);
        for (int i = 0; i < sizeNumbers; i++) {
            assertEquals(arNumbers[i], numbers.get(i));
        }
        for (int i = 0; i < sizeStrings; i++) {
            assertEquals(arStrings[i], strings.get(i));

        }
    }

    @Test
    public void testRemoveAtIndex() {
        Integer[] arNumbers_2 = {10, 7, 11, 13, 10, 2000};
        assertEquals(null, numbers.remove(7));
        assertEquals(null, numbers.remove(17));
        Integer res = (Integer) numbers.remove(3);
        assertEquals(-2, (int) res);
        assertEquals(arNumbers.length - 1, numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            assertEquals(arNumbers_2[i], numbers.get(i));
        }

    }

    @Test
    public void testRemoveObj() {
        assertEquals(true, strings.remove("abc"));
       assertEquals(false, strings.remove("78")); //not working
        assertEquals(false, strings.remove(null));
        assertEquals(false, numbers.remove(7));//why jumps from obj to index
    }

    @Test
    public void testIndexOf() {
        assertEquals(2, numbers.indexOf(11));
        assertEquals(-1, numbers.indexOf(null));
        assertEquals(-1, numbers.indexOf(76));
        assertEquals(-1, strings.indexOf("he"));
        assertEquals(3, strings.indexOf("abc"));


    }

    @Test
    public void testLastIndexOf() {
        assertEquals(6, numbers.lastIndexOf(2000));
        assertNotEquals(2, numbers.lastIndexOf(11));
        assertEquals(-1, numbers.lastIndexOf(null));
        assertEquals(-1, numbers.lastIndexOf(76));
        assertEquals(-1, strings.lastIndexOf("he"));
        assertEquals(3, strings.lastIndexOf("abc"));
        assertNotEquals(0, strings.lastIndexOf("abc"));


    }

    @Test
    public void testContains() {
        assertEquals(true, numbers.contains(11));
        assertEquals(false, numbers.contains(null));
        assertEquals(false, numbers.contains(76));
        assertEquals(false, strings.contains("he"));
        assertEquals(true, strings.contains("abc"));


    }

    @Test
    public void testToArray() {
        assertEquals(arNumbers, numbers.toArray()); //no go


    }
}
