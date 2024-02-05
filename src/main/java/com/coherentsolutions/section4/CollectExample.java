package com.coherentsolutions.section4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExample {
    public static void main(String[] args) {
        // functional programming
        Stream<String> fruitStream = Stream.of("Apple", "Banana", "Cherry");
        List<String> fruitList = fruitStream.collect(Collectors.toList());
        System.out.println(fruitList);

        // imperative programming
        String[] fruits = {"Apple", "Banana", "Cherry"};
        List<String> fruitList2 = new ArrayList<>();
        for (String fruit : fruits) {
            fruitList2.add(fruit);
        }
        System.out.println(fruitList2);

    }
}

