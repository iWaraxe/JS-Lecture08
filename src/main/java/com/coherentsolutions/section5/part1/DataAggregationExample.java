package com.coherentsolutions.section5.part1;

import java.util.List;

public class DataAggregationExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}

