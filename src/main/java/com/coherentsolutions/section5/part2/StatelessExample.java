package com.coherentsolutions.section5.part2;

import java.util.List;
import java.util.stream.Collectors;

public class StatelessExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(doubled);
    }
}
