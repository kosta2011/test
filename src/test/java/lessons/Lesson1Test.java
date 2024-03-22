package lessons;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static lessons.Lesson1.*;
import static org.junit.jupiter.api.Assertions.*;

public class Lesson1Test {

    @Test
    @DisplayName("testEvenNumber")
    public void testEvenNumber() {
        assertTrue(isEven(4));

        System.out.println("test completed");
    }

    @Test
    @DisplayName("testOddNumber")
    public void testOddNumber() {
        assertFalse(isEven(5));

        System.out.println("test completed");
    }

    @Test
    @DisplayName("testFactorial")
    public void testFactorial() {
        assertEquals(120, factorial(5));

        System.out.println("test completed");
    }

    @Test
    @DisplayName("testFactorialOfZero")
    public void testFactorialOfZero() {
        assertEquals(1, factorial(0));

        System.out.println("test completed");
    }

    @Test
    @DisplayName("testReverse")
    public void testReverse() {
        assertEquals("dlrow ,olleH", reverse("Hello, world"));

        System.out.println("test completed");
    }

    @Test
    @DisplayName("testFindMax")
    public void testFindMax() {
        assertEquals(8, findMax(new int[]{1, 3, 7, 6, 8, 2}));

        System.out.println("test completed");
    }

}