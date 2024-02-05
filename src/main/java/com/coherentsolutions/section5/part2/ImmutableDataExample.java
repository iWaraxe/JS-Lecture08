package com.coherentsolutions.section5.part2;

import java.util.Collections;
import java.util.List;

public class ImmutableDataExample {
    public static void main(String[] args) {
        List<String> originalList = List.of("apple", "banana", "cherry");
        List<String> immutableList = Collections.unmodifiableList(originalList);
    }
}
