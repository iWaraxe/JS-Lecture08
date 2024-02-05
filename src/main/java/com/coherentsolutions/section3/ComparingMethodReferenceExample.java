package com.coherentsolutions.section3;

import java.util.Arrays;
import java.util.Comparator;

public class ComparingMethodReferenceExample {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Oranges", "Banana"};

        Comparator<String> lengthComparator = Comparator.comparing(String::length).reversed();

        Arrays.sort(fruits, lengthComparator);

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
