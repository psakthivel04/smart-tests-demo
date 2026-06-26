package com.example.demo;

public class StringUtils {

    public String reverse(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }

    public boolean isPalindrome(String s) {
        if (s == null) return false;
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public int countVowels(String s) {
        if (s == null) return 0;
        return (int) s.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

    public String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    public boolean contains(String s, String sub) {
        if (s == null || sub == null) return false;
        return s.contains(sub);
    }

    public String repeat(String s, int times) {
        if (s == null) return null;
        return s.repeat(Math.max(0, times));
    }

    public int countWords(String s) {
        if (s == null || s.isBlank()) return 0;
        return s.trim().split("\\s+").length;
    }

    public String toUpperCase(String s) {
        return s == null ? null : s.toUpperCase();
    }

    public String toLowerCase(String s) {
        return s == null ? null : s.toLowerCase();
    }

    public String trimAll(String s) {
        return s == null ? null : s.strip();
    }

    public boolean isBlank(String s) {
        return s == null || s.isBlank();
    }

    public String truncate(String s, int maxLength) {
        if (s == null) return null;
        if (maxLength < 0) throw new IllegalArgumentException("maxLength must be non-negative");
        return s.length() <= maxLength ? s : s.substring(0, maxLength);
    }
}
