package com.coherentsolutions.section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // functional programming
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("The sum is: " + sum);

        // imperative programming
        int sum2 = 0;
        for (int number : numbers) {
            sum2 += number;
        }
        System.out.println("The sum is: " + sum2);
    }
}
