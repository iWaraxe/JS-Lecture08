package com.coherentsolutions.section5.part2;

import java.util.List;
import java.util.stream.Collectors;

public class MethodReferencesExample {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "cherry");
        List<String> upperCaseFruits = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseFruits);
    }
}
