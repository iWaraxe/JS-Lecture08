package com.coherentsolutions.section1;

import java.util.ArrayList;
import java.util.Collections;

public class ImportanceOfCollectionsDemo {
    public static void main(String[] args) {
        // Creating an ArrayList and adding elements
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);

        // Sorting the ArrayList
        Collections.sort(numbers);

        // Displaying the sorted ArrayList
        System.out.println("Sorted ArrayList: ");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

