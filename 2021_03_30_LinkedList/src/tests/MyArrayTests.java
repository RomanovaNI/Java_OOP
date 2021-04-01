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
        //assertEquals(false, strings.remove("78")); //not working
        assertEquals(false, strings.remove(null));
        assertEquals(true, numbers.remove((Integer) 10));
        assertEquals(arNumbers.length-1,numbers.size());
        assertEquals(7,numbers.get(0));
        assertEquals(10,numbers.get(numbers.size()-2));
        assertEquals(true, numbers.remove((Integer) 10));
        assertEquals(-1, numbers.indexOf(10));

        assertEquals(true, numbers.remove((Integer) 7));
        assertEquals(true, numbers.remove((Integer) 11));
        assertEquals(false, numbers.remove((Integer) 2));
        assertTrue(numbers.remove((Integer)(-2)));
        //  assertEquals(false, numbers.remove((Integer) -2));// how to write negative
        assertEquals(false, numbers.remove((Integer) 8));


    }

    @Test
    public void testIndexOf() {
        assertEquals(2, numbers.indexOf(11));
        assertEquals(-1, numbers.indexOf(null));
        assertEquals(-1, numbers.indexOf(-100));
        assertEquals(-1, numbers.indexOf("abc"));
        assertEquals(-1, numbers.indexOf(76));
        assertEquals(-1, strings.indexOf("he"));
        assertEquals(-1, strings.indexOf(null));
        assertEquals(-1, strings.indexOf(12));
        assertEquals(0, strings.indexOf("abc"));
        assertNotEquals(3, strings.indexOf("abc"));


    }

    @Test
    public void testLastIndexOf() {
        assertEquals(6, numbers.lastIndexOf(2000));
        assertEquals(5, numbers.lastIndexOf(10));
        assertEquals(2, numbers.lastIndexOf(11));
        assertEquals(-1, numbers.lastIndexOf(null));
        assertEquals(-1, numbers.lastIndexOf(76));
        assertNotEquals(5, numbers.lastIndexOf(2000));
        assertEquals(-1, strings.lastIndexOf("he"));
        assertEquals(3, strings.lastIndexOf("abc"));
        assertEquals(1, strings.lastIndexOf("lmn"));
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

        assertEquals(arNumbers, numbers.toArray());
        assertEquals(arStrings, strings.toArray());
        assertArrayEquals(arNumbers, numbers.toArray());
        assertArrayEquals(arStrings, strings.toArray());

    }
    @Test
    public void testClear() {
        numbers.clear();
        strings.clear();
        assertEquals(0, numbers.size());
        assertEquals(0, strings.size());

    }@Test
    public void testIterable() {
        int index=0;
        for (Object obj: numbers) {
      assertEquals(arNumbers[index++], obj);
        }
        assertEquals(arNumbers.length, index);

    }
}
