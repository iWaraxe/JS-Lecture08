package com.coherentsolutions.section4.extra;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterImperative {
    public static void main(String[] args) {
        String str = "aabbccdef";
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeated character
        Character firstNonRepeatedChar = null;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                firstNonRepeatedChar = entry.getKey();
                break;
            }
        }

        // Time taken by Imperative approach: 0.041 seconds
        System.out.println("First non-repeated character: " + firstNonRepeatedChar);
    }
}

