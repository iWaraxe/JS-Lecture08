package com.coherentsolutions.section3;

@FunctionalInterface
interface SimpleInterface {
    void doSomething();
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        SimpleInterface simpleInterface = () -> System.out.println("Doing something...");
        simpleInterface.doSomething();
    }
}

