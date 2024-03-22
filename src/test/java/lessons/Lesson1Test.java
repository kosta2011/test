package lessons;

import org.junit.jupiter.api.Test;

import static lessons.Lesson1.*;
import static org.junit.jupiter.api.Assertions.*;

class Lesson1Test {
    @Test
    public void testEvenNumber() {
        assertTrue(isEven(4));
    }

    @Test
    public void testOddNumber() {
        assertFalse(isEven(5));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, factorial(5));
    }

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, factorial(0));
    }

    @Test
    public void testReverse() {
        assertEquals("dlrow ,olleH", reverse("Hello, world"));
    }

    @Test
    public void testFindMax() {
        assertEquals(8, findMax(new int[]{1, 3, 7, 6, 8, 2}));
    }

}