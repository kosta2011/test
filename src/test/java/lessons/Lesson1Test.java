package lessons;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static lessons.Lesson1.*;
import static org.junit.jupiter.api.Assertions.*;

class Lesson1Test {

    @Test
    @DisplayName("testEvenNumber")
    public void testEvenNumber() {
        assertTrue(isEven(4));
    }

    @Test
    @DisplayName("testOddNumber")
    public void testOddNumber() {
        assertFalse(isEven(5));
    }

    @Test
    @DisplayName("testFactorial")
    public void testFactorial() {
        assertEquals(120, factorial(5));
    }

    @Test
    @DisplayName("testFactorialOfZero")
    public void testFactorialOfZero() {
        assertEquals(1, factorial(0));
    }

    @Test
    @DisplayName("testReverse")
    public void testReverse() {
        assertEquals("dlrow ,olleH", reverse("Hello, world"));
    }

    @Test
    @DisplayName("testFindMax")
    public void testFindMax() {
        assertEquals(8, findMax(new int[]{1, 3, 7, 6, 8, 2}));
    }

}