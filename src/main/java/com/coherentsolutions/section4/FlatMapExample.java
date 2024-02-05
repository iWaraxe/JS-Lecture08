package com.coherentsolutions.section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Java 8", "Streams Introduction", "Functional Programming");

        // functional programming
        List<String> words = sentences.stream()
                .flatMap(sentence -> Stream.of(sentence.split(" ")))
                .collect(Collectors.toList());
        System.out.println(words);

        // imperative programming
        List<String> words2 = new ArrayList<>();
        for (String sentence : sentences) {
            String[] splitWords = sentence.split(" ");
            for (String word : splitWords) {
                words2.add(word);
            }
        }
        System.out.println(words2);
    }
}

