package com.coherentsolutions.section2;

import java.util.function.Predicate;
import java.util.function.BiFunction;

public class LambdaSyntaxUsageDemo {
    public static void main(String[] args) {
        // Example 1: Lambda with No Parameters
        Runnable noParamLambda = () -> System.out.println("This lambda takes no parameters.");
        noParamLambda.run();

        // Example 2: Lambda with a Single Parameter
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));  // Output will be true
        System.out.println("Is 3 even? " + isEven.test(3));  // Output will be false

        // Example 3: Lambda with Multiple Parameters
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println("5 + 3 = " + add.apply(5, 3));  // Output will be 8
    }
}
