package com.coherentsolutions.section5.part1;

import java.util.List;
import java.util.stream.Collectors;

public class DataFilteringExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A") || name.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}

