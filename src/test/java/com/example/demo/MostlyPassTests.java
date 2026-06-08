package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * These tests pass ~90% of the time. They fail only when a rare modulo condition holds.
 * Simulates tests that are reliable but occasionally flake.
 */
class MostlyPassTests {

    private Calculator calc;
    private StringUtils str;
    private MathUtils math;
    private CollectionUtils col;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        str = new StringUtils();
        math = new MathUtils();
        col = new CollectionUtils();
    }

    @Test
    void usuallyPassAdd() {
        // Fails ~10% of runs (when last digit of epoch ms is 0)
        long now = System.currentTimeMillis();
        if (now % 10 == 0) fail("Rare flake: intentional failure for ~10% of runs");
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void usuallyPassSubtract() {
        long now = System.currentTimeMillis() + 1;
        if (now % 10 == 0) fail("Rare flake: intentional failure for ~10% of runs");
        assertEquals(1, calc.subtract(4, 3));
    }

    @Test
    void usuallyPassMultiply() {
        long now = System.currentTimeMillis() + 2;
        if (now % 10 == 0) fail("Rare flake: intentional failure for ~10% of runs");
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void usuallyPassDivide() {
        long now = System.currentTimeMillis() + 3;
        if (now % 10 == 0) fail("Rare flake: intentional failure for ~10% of runs");
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    void usuallyPassReverse() {
        long now = System.currentTimeMillis() + 4;
        if (now % 10 == 0) fail("Rare flake: intentional failure for ~10% of runs");
        assertEquals("dlrow", str.reverse("world"));
    }

    @Test
    void usuallyPassPalindrome() {
        long now = System.currentTimeMillis() + 5;
        if (now % 10 == 0) fail("Rare flake: intentional failure for ~10% of runs");
        assertTrue(str.isPalindrome("madam"));
    }

    @Test
    void usuallyPassPrime() {
        long now = System.currentTimeMillis() + 6;
        if (now % 10 == 0) fail("Rare flake: intentional failure for ~10% of runs");
        assertTrue(math.isPrime(11));
    }

    @Test
    void usuallyPassFibonacci() {
        long now = System.currentTimeMillis() + 7;
        if (now % 10 == 0) fail("Rare flake: intentional failure for ~10% of runs");
        assertEquals(5, math.fibonacci(5));
    }

    @Test
    void usuallyPassSum() {
        long now = System.currentTimeMillis() + 8;
        if (now % 10 == 0) fail("Rare flake: intentional failure for ~10% of runs");
        assertEquals(10, col.sum(List.of(1, 2, 3, 4)));
    }

    @Test
    void usuallyPassIsEven() {
        long now = System.currentTimeMillis() + 9;
        if (now % 10 == 0) fail("Rare flake: intentional failure for ~10% of runs");
        assertFalse(math.isEven(7));
    }
}
