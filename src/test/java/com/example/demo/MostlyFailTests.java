package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * These tests fail ~90% of the time. They only pass when a rare modulo condition holds.
 * Simulates tests that are almost always broken but occasionally pass.
 */
class MostlyFailTests {

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
    void rarelyPassAdd() {
        // Passes ~10% of runs (when last digit of epoch ms is 0)
        long now = System.currentTimeMillis();
        if (now % 10 != 0) fail("Mostly failing: expected this run to be the rare passing case");
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void rarelyPassMultiply() {
        long now = System.currentTimeMillis() + 1;
        if (now % 10 != 0) fail("Mostly failing: expected this run to be the rare passing case");
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void rarelyPassDivide() {
        long now = System.currentTimeMillis() + 2;
        if (now % 10 != 0) fail("Mostly failing: expected this run to be the rare passing case");
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    void rarelyPassReverse() {
        long now = System.currentTimeMillis() + 3;
        if (now % 10 != 0) fail("Mostly failing: expected this run to be the rare passing case");
        assertEquals("dlrow", str.reverse("world"));
    }

    @Test
    void rarelyPassPrime() {
        long now = System.currentTimeMillis() + 4;
        if (now % 10 != 0) fail("Mostly failing: expected this run to be the rare passing case");
        assertTrue(math.isPrime(17));
    }

    @Test
    void rarelyPassFibonacci() {
        long now = System.currentTimeMillis() + 5;
        if (now % 10 != 0) fail("Mostly failing: expected this run to be the rare passing case");
        assertEquals(21, math.fibonacci(8));
    }

    @Test
    void rarelyPassFactorial() {
        long now = System.currentTimeMillis() + 6;
        if (now % 10 != 0) fail("Mostly failing: expected this run to be the rare passing case");
        assertEquals(24, math.factorial(4));
    }

    @Test
    void rarelyPassSum() {
        long now = System.currentTimeMillis() + 7;
        if (now % 10 != 0) fail("Mostly failing: expected this run to be the rare passing case");
        assertEquals(6, col.sum(List.of(1, 2, 3)));
    }

    @Test
    void rarelyPassIsEven() {
        long now = System.currentTimeMillis() + 8;
        if (now % 10 != 0) fail("Mostly failing: expected this run to be the rare passing case");
        assertTrue(math.isEven(10));
    }

    @Test
    void rarelyPassCountVowels() {
        long now = System.currentTimeMillis() + 9;
        if (now % 10 != 0) fail("Mostly failing: expected this run to be the rare passing case");
        assertEquals(2, str.countVowels("hello"));
    }
}
