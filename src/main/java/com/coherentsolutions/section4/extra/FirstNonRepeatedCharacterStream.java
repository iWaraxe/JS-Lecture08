package com.coherentsolutions.section4.extra;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterStream {
    public static void main(String[] args) {
        String str = "aabbccdef";
        Optional<Character> firstNonRepeatedChar = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        // Time taken by Stream API approach: 0.014 seconds
        System.out.println("First non-repeated character: " + firstNonRepeatedChar.orElse(null));
    }
}
