package com.example.demo;

public class Calculator {

    public int add(int x, int y) { return x + y; }

    public int subtract(int a, int b) { return a - b; }

    public int multiply(int g, int h) { return g * h; }


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

    public double log(double n) {
        if (n <= 0) throw new IllegalArgumentException("Argument must be positive");
        return Math.log(n);
    }

    public double average(int a, int b) { return (a + b) / 2.0; }

    public double roundToDecimalPlaces(double value, int places) {
        if (places < 0) throw new IllegalArgumentException("places must be non-negative");
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
