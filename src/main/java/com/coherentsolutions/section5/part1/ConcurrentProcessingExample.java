package com.coherentsolutions.section5.part1;

import java.util.List;

public class ConcurrentProcessingExample {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date");
        words.parallelStream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
