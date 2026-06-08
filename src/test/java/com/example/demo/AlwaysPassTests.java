package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * These tests always pass. They test correct behavior with correct assertions.
 */
class AlwaysPassTests {

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

    @Test void addPositives() { assertEquals(5, calc.add(2, 3)); }
    @Test void addNegatives() { assertEquals(-5, calc.add(-2, -3)); }
    @Test void addZero() { assertEquals(7, calc.add(7, 0)); }
    @Test void subtractPositive() { assertEquals(1, calc.subtract(3, 2)); }
    @Test void multiplyPositives() { assertEquals(6, calc.multiply(2, 3)); }
    @Test void dividePositives() { assertEquals(4, calc.divide(8, 2)); }
    @Test void divideByZeroThrows() { assertThrows(ArithmeticException.class, () -> calc.divide(5, 0)); }
    @Test void sqrtOfFour() { assertEquals(2.0, calc.sqrt(4), 0.001); }
    @Test void sqrtNegativeThrows() { assertThrows(IllegalArgumentException.class, () -> calc.sqrt(-1)); }
    @Test void absNegative() { assertEquals(5, calc.abs(-5)); }
    @Test void reverseString() { assertEquals("olleh", str.reverse("hello")); }
    @Test void isPalindromeTrue() { assertTrue(str.isPalindrome("racecar")); }
    @Test void isPalindromeFalse() { assertFalse(str.isPalindrome("hello")); }
    @Test void countVowels() { assertEquals(2, str.countVowels("hello")); }
    @Test void isPrimeTrue() { assertTrue(math.isPrime(7)); }
    @Test void isPrimeFalse() { assertFalse(math.isPrime(4)); }
    @Test void fibonacci() { assertEquals(8, math.fibonacci(6)); }
    @Test void factorial() { assertEquals(120, math.factorial(5)); }
    @Test void sumList() { assertEquals(10, col.sum(List.of(1, 2, 3, 4))); }
    @Test void maxList() { assertEquals(9, col.max(List.of(3, 9, 1, 5))); }
}
