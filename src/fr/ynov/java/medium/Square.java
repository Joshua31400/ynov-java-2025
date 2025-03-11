package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {
    public static double GetSquare(double num) {
        return num * num;
    }

    public static void main(String[] args) {
        double num = 5.6;
        double num1 = GetSquare(num);
        System.out.println(num1);
    }
}
