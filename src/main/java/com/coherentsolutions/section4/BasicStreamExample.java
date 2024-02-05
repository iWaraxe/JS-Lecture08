package com.coherentsolutions.section4;

import java.util.stream.Stream;

public class BasicStreamExample {
    public static void main(String[] args) {
        // functional programming
        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
        numberStream.forEach(System.out::println);

        // imperative programming
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
