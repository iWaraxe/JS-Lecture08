package com.coherentsolutions.section3;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        Integer[] numbers = {3, 1, 4, 1, 5, 9};

        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        Arrays.sort(numbers, integerComparator);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
