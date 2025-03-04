package fr.ynov.java.easy;

import javax.swing.*;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number if you want to even or odd: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("You are even");
        }
        else if (number % 2 != 0) {
            System.out.println("You are odd");
        }
    }
}