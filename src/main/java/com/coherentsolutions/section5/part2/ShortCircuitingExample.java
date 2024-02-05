package com.coherentsolutions.section5.part2;

import java.util.List;

public class ShortCircuitingExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst()
                .orElse(-1);
        System.out.println("First even number: " + firstEven);
    }
}

