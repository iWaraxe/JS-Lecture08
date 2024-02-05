package com.coherentsolutions.section2;

public class BasicLambdaDemo {
    public static void main(String[] args) {
        // Traditional way using anonymous class
        Runnable traditionalRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in traditional way.");
            }
        };

        // Using Lambda Expression
        Runnable lambdaRunnable = () -> System.out.println("Running using Lambda.");

        // Execute both Runnables
        traditionalRunnable.run();
        lambdaRunnable.run();
    }
}
