package com.coherentsolutions.section3;

import java.util.*;

public class AdditionalExample {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 10; i > 0; i--) {
            integerList.add(random.nextInt(20));
        }

        System.out.println(integerList);
        integerList.sort(Comparator.comparing(Integer::intValue).reversed());
        System.out.println(integerList);


        List<String> stringList = new ArrayList<>();
        stringList.add("bbbbbb");
        stringList.add("aaa");
        stringList.add("CCCC");

        Comparator<String> lengthComparator = Comparator.comparing(String::length);
        System.out.println(stringList);
        stringList.sort(Comparator.comparing(String::toString).reversed());
        System.out.println(stringList);
    }
}
