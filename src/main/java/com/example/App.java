
package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        App app = new App();

        System.out.println("Welcome to Maven CI/CD Pipeline");

        System.out.println("Addition: " + app.add(10, 20));
        System.out.println("Subtraction: " + app.subtract(20, 10));
        System.out.println("Multiplication: " + app.multiply(10, 5));
        System.out.println("Division: " + app.divide(20, 5));
    }
}
