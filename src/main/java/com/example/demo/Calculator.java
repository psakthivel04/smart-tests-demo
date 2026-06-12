package com.example.demo;

public class Calculator {

    public int add(int x, int y) { return x + y; }

    public int subtract(int a, int b) { return a - b; }

    public int multiply(int a, int b) { return a * b; }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public double power(double base, double exponent) { return Math.pow(base, exponent); }

    public double sqrt(double n) {
        if (n < 0) throw new IllegalArgumentException("Cannot take sqrt of negative number");
        return Math.sqrt(n);
    }

    public int abs(int n) { return Math.abs(n); }

    public int modulo(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a % b;
    }

    public int max(int a, int b) { return Math.max(a, b); }

    public int min(int a, int b) { return Math.min(a, b); }
}
