package com.coherentsolutions.section1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class BasicCollectionsDemo {
    public static void main(String[] args) {
        // Example of an ArrayList
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");

        // Example of a HashSet
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(1);
        numberSet.add(2);

        // Example of a HashMap
        HashMap<String, Integer> wordCount = new HashMap<>();
        wordCount.put("hello", 1);
        wordCount.put("world", 2);

        // Output to showcase that the collections are populated
        System.out.println("ArrayList: " + stringList);
        System.out.println("HashSet: " + numberSet);
        System.out.println("HashMap: " + wordCount);
    }
}
