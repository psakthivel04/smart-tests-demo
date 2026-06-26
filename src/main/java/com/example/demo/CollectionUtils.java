package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUtils {

    public int sum(List<Integer> list) {
        if (list == null) return 0;
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public double average(List<Integer> list) {
        if (list == null || list.isEmpty()) throw new IllegalArgumentException("List is empty");
        return list.stream().mapToInt(Integer::intValue).average().orElseThrow();
    }

    public int max(List<Integer> list) {
        if (list == null || list.isEmpty()) throw new IllegalArgumentException("List is empty");
        return Collections.max(list);
    }

    public int min(List<Integer> list) {
        if (list == null || list.isEmpty()) throw new IllegalArgumentException("List is empty");
        return Collections.min(list);
    }

    public boolean contains(List<Integer> list, int value) {
        if (list == null) return false;
        return list.contains(value);
    }

    public boolean isEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }

    public <T> List<T> reverse(List<T> list) {
        if (list == null) return null;
        List<T> copy = new ArrayList<>(list);
        Collections.reverse(copy);
        return copy;
    }

    public List<Integer> distinct(List<Integer> list) {
        if (list == null) return null;
        return list.stream().distinct().collect(Collectors.toList());
    }

    public List<Integer> sort(List<Integer> list) {
        if (list == null) return null;
        List<Integer> copy = new ArrayList<>(list);
        Collections.sort(copy);
        return copy;
    }

    public long count(List<?> list) {
        return list == null ? 0 : list.size();
    }

    public double median(List<Integer> list) {
        if (list == null || list.isEmpty()) throw new IllegalArgumentException("List is empty");
        List<Integer> sorted = sort(list);
        int mid = sorted.size() / 2;
        return sorted.size() % 2 == 0
                ? (sorted.get(mid - 1) + sorted.get(mid)) / 2.0
                : sorted.get(mid);
    }
}
