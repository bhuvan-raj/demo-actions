
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {

    App app = new App();

    @Test
    public void testAddition() {
        assertEquals(30, app.add(10, 20));
    }

    @Test
    public void testSubtraction() {
        assertEquals(10, app.subtract(20, 10));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, app.multiply(10, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(4, app.divide(20, 5));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> app.divide(10, 0)
        );
    }
}
