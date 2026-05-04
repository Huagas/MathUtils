package com.example.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    public void testFactorial_ValidInput() {
        assertEquals(120, MathUtils.calculateFactorial(5));
    }

    @Test
    public void testFactorial_BoundaryValue_Zero() {
        assertEquals(1, MathUtils.calculateFactorial(0));
    }

    @Test
    public void testFactorial_NegativeInput_ThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.calculateFactorial(-1);
        });

        assertEquals("Input must be a non-negative integer.", exception.getMessage());
    }

    @Test
    public void testFactorial_ExceedsMaximum_ThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
           MathUtils.calculateFactorial(21);
        });

        assertEquals("Input exceeds maximum supported value.", exception.getMessage());
    }
}