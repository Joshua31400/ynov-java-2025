package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name here: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age here: ");
        String age = scanner.nextLine();

        System.out.println("Hello " + name + ", you have " + age + " years old ;)");

        scanner.close();
    }
}
