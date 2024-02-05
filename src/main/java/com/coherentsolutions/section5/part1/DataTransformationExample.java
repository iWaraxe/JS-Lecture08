package com.coherentsolutions.section5.part1;

import java.util.stream.Collectors;
import java.util.List;

public class DataTransformationExample {
    public static void main(String[] args) {
        List<String> hexNumbers = List.of("1A", "2B", "3C");
        List<Integer> decimalNumbers = hexNumbers.stream()
                .map(hex -> Integer.parseInt(hex, 16))
                .collect(Collectors.toList());
        System.out.println(decimalNumbers);
    }
}

