package com.coherentsolutions.section5.part3;

import java.util.List;

public class StudentFiltering {
    public static void main(String[] args) {
        List<String> students = List.of("Alice", "Bob", "Charlie");
        long count = students.stream()
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println("Number of students whose names start with 'A': " + count);
    }
}
