package org.example;

import java.util.Scanner;

public class Main {
        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }

        public static double performArithmetic(double a, double b, String operation) {
            double result = 0;

            switch (operation) {
                case "add":
                    result = a + b;
                    break;
                case "subtract":
                    result = a - b;
                    break;
                case "multiply":
                    result = a * b;
                    break;
                case "divide":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
            }

            return result;
        }

        public static int Looop(int n) {
            for(int i=0;i<n;i++)
            {
                System.out.println(i+1);
            }
            return 0;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 number for opertaion");
            double num1 = scanner.nextDouble();
            System.out.println("Enter 1 number for opertaion");
            double num2 = scanner.nextDouble();
            System.out.println("Enter operation add subtract multiply divide");
            String operation = scanner.next().toLowerCase();
            double arithmeticResult = performArithmetic(num1, num2, operation);
            System.out.println(arithmeticResult);
            System.out.println("Enter 1 number for factorial");
            int number = scanner.nextInt();

            try {
                if (number < 0) {
                    throw new IllegalArgumentException("Negative number");
                }
                System.out.println(factorial(number));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Enter number to show from 1");
            int number1 = scanner.nextInt();
            Looop(number1);
            scanner.close();
        }
    }