package com.coherentsolutions.section3;

import java.util.Arrays;
import java.util.Comparator;

public class ComparingMethodExample {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Oranges", "Banana"};

        Comparator<String> lengthComparator = Comparator.comparing(str -> str.length());

        Arrays.sort(fruits, lengthComparator.reversed());

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
