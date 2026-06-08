package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * These tests are flaky (~50% pass rate). They use time-based or random conditions
 * to produce non-deterministic outcomes across CI runs.
 */
class FlakyTests {

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
    void flakyAdd() {
        // Passes ~50% of the time based on even/odd milliseconds
        long now = System.currentTimeMillis();
        if (now % 2 == 0) {
            assertEquals(5, calc.add(2, 3));
        } else {
            fail("Flaky: intentional failure on odd millisecond");
        }
    }

    @Test
    void flakySubtract() {
        long now = System.currentTimeMillis();
        if (now % 2 == 0) {
            assertEquals(1, calc.subtract(4, 3));
        } else {
            fail("Flaky: intentional failure on odd millisecond");
        }
    }

    @Test
    void flakyMultiply() {
        long now = System.currentTimeMillis() + 1; // offset so not always same as flakyAdd
        if (now % 2 == 0) {
            assertEquals(12, calc.multiply(3, 4));
        } else {
            fail("Flaky: intentional failure");
        }
    }

    @Test
    void flakyReverse() {
        long now = System.currentTimeMillis();
        if (now % 2 == 0) {
            assertEquals("dlrow", str.reverse("world"));
        } else {
            fail("Flaky: intentional failure");
        }
    }

    @Test
    void flakyPalindrome() {
        long now = System.currentTimeMillis() + 3;
        if (now % 2 == 0) {
            assertTrue(str.isPalindrome("level"));
        } else {
            fail("Flaky: intentional failure");
        }
    }

    @Test
    void flakyPrime() {
        long now = System.currentTimeMillis();
        if (now % 2 == 0) {
            assertTrue(math.isPrime(13));
        } else {
            fail("Flaky: intentional failure");
        }
    }

    @Test
    void flakyFibonacci() {
        long now = System.currentTimeMillis() + 7;
        if (now % 2 == 0) {
            assertEquals(13, math.fibonacci(7));
        } else {
            fail("Flaky: intentional failure");
        }
    }

    @Test
    void flakySum() {
        long now = System.currentTimeMillis();
        if (now % 2 == 0) {
            assertEquals(15, col.sum(List.of(1, 2, 3, 4, 5)));
        } else {
            fail("Flaky: intentional failure");
        }
    }

    @Test
    void flakyMax() {
        long now = System.currentTimeMillis() + 11;
        if (now % 2 == 0) {
            assertEquals(9, col.max(List.of(1, 9, 3)));
        } else {
            fail("Flaky: intentional failure");
        }
    }

    @Test
    void flakyMin() {
        long now = System.currentTimeMillis();
        if (now % 2 == 0) {
            assertEquals(1, col.min(List.of(1, 9, 3)));
        } else {
            fail("Flaky: intentional failure");
        }
    }

    @Test
    void flakyContains() {
        long now = System.currentTimeMillis() + 13;
        if (now % 2 == 0) {
            assertTrue(col.contains(List.of(1, 2, 3), 2));
        } else {
            fail("Flaky: intentional failure");
        }
    }

    @Test
    void flakyIsEven() {
        long now = System.currentTimeMillis();
        if (now % 2 == 0) {
            assertTrue(math.isEven(4));
        } else {
            fail("Flaky: intentional failure");
        }
    }

    @Test
    void flakyGcd() {
        long now = System.currentTimeMillis() + 17;
        if (now % 2 == 0) {
            assertEquals(4, math.gcd(8, 12));
        } else {
            fail("Flaky: intentional failure");
        }
    }

    @Test
    void flakyCountVowels() {
        long now = System.currentTimeMillis();
        if (now % 2 == 0) {
            assertEquals(3, str.countVowels("beautiful"));
        } else {
            fail("Flaky: intentional failure");
        }
    }

    @Test
    void flakyCapitalize() {
        long now = System.currentTimeMillis() + 19;
        if (now % 2 == 0) {
            assertEquals("Hello", str.capitalize("hello"));
        } else {
            fail("Flaky: intentional failure");
        }
    }
}
