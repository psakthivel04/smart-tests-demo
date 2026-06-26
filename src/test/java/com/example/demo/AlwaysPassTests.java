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

    // new methods from last commit
    @Test void logOfE() { assertEquals(1.0, calc.log(Math.E), 0.0001); }
    @Test void logOfOne() { assertEquals(0.0, calc.log(1.0), 0.0001); }
    @Test void logNonPositiveThrows() { assertThrows(IllegalArgumentException.class, () -> calc.log(0)); }

    @Test void medianOddSize() { assertEquals(3.0, col.median(List.of(1, 3, 5)), 0.0001); }
    @Test void medianEvenSize() { assertEquals(3.5, col.median(List.of(1, 3, 4, 6)), 0.0001); }
    @Test void medianEmptyThrows() { assertThrows(IllegalArgumentException.class, () -> col.median(List.of())); }

    @Test void isOddTrue() { assertTrue(math.isOdd(7)); }
    @Test void isOddFalse() { assertFalse(math.isOdd(4)); }

    @Test void truncateShort() { assertEquals("hi", str.truncate("hi", 10)); }
    @Test void truncateLong() { assertEquals("hel", str.truncate("hello", 3)); }
    @Test void truncateNegativeLengthThrows() { assertThrows(IllegalArgumentException.class, () -> str.truncate("hi", -1)); }

    @Test void isPerfectSquareTrue() { assertTrue(math.isPerfectSquare(25)); }
    @Test void isPerfectSquareFalse() { assertFalse(math.isPerfectSquare(26)); }
    @Test void isPerfectSquareZero() { assertTrue(math.isPerfectSquare(0)); }
    @Test void isPerfectSquareNegative() { assertFalse(math.isPerfectSquare(-4)); }

    @Test void productList() { assertEquals(24L, col.product(List.of(1, 2, 3, 4))); }
    @Test void productSingle() { assertEquals(7L, col.product(List.of(7))); }
    @Test void productEmptyThrows() { assertThrows(IllegalArgumentException.class, () -> col.product(List.of())); }

    @Test void isBlankNull() { assertTrue(str.isBlank(null)); }
    @Test void isBlankWhitespace() { assertTrue(str.isBlank("   ")); }
    @Test void isBlankFalse() { assertFalse(str.isBlank("hi")); }

    @Test void averageTwo() { assertEquals(3.5, calc.average(3, 4), 0.0001); }
    @Test void averageSame() { assertEquals(5.0, calc.average(5, 5), 0.0001); }

    @Test void sumDigits() { assertEquals(6, math.sumDigits(123)); }
    @Test void sumDigitsNegative() { assertEquals(6, math.sumDigits(-123)); }
    @Test void sumDigitsZero() { assertEquals(0, math.sumDigits(0)); }
}
