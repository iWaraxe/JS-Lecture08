package com.coherentsolutions.section5.part3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSorting {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(List.of("Charlie", "Bob", "Alice"));
        students.sort(Comparator.naturalOrder());
        System.out.println("Sorted students: " + students);
    }
}

