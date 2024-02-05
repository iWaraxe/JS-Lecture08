package com.coherentsolutions.section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        // functional programming
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // imperative programming
        List<Integer> evenNumbers2 = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers2.add(number);
            }
        }
        System.out.println(evenNumbers2);
    }
}
