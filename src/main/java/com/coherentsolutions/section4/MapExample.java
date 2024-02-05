package com.coherentsolutions.section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        // functional programming
        List<String> upperCaseFruits = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseFruits);

        // imperative programming
        List<String> upperCaseFruits2 = new ArrayList<>();
        for (String fruit : fruits) {
            upperCaseFruits2.add(fruit.toUpperCase());
        }
        System.out.println(upperCaseFruits2);
    }
}
