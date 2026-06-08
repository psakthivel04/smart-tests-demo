package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * These tests always fail. They contain intentionally wrong expected values.
 * They simulate permanently broken tests or tests that test against known bugs.
 */
class AlwaysFailTests {

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

    @Test void addWrongExpected() { assertEquals(999, calc.add(2, 3)); }
    @Test void multiplyWrongExpected() { assertEquals(100, calc.multiply(2, 3)); }
    @Test void subtractWrongExpected() { assertEquals(50, calc.subtract(10, 5)); }
    @Test void divideWrongExpected() { assertEquals(3, calc.divide(10, 2)); }
    @Test void absWrongExpected() { assertEquals(42, calc.abs(-5)); }
    @Test void reverseWrongExpected() { assertEquals("hello", str.reverse("hello")); }
    @Test void countVowelsWrongExpected() { assertEquals(0, str.countVowels("hello")); }
    @Test void fibonacciWrongExpected() { assertEquals(999, math.fibonacci(6)); }
    @Test void factorialWrongExpected() { assertEquals(1, math.factorial(5)); }
    @Test void sumListWrongExpected() { assertEquals(999, col.sum(List.of(1, 2, 3, 4))); }
}
