package fr.ynov.java.easy;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <number1> <number2>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        scanner.close();

        double result = 0;
        if (op == '+') result = num1 + num2;
        else if (op == '-') result = num1 - num2;
        else if (op == '*') result = num1 * num2;
        else if (op == '/') {
            if (num2 == 0) {
                System.out.println("Error: Division by zero!");
                return;
            }
            result = num1 / num2;
        } else {
            System.out.println("Invalid operator!");
            return;
        }

        System.out.println("Result: " + result);
    }
}