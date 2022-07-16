package com.softuni;

import java.util.*;


public class Exercise {
    private static double MathPower(double number, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        int pow = scanner.nextInt();
        System.out.printf("%.0f",MathPower(num, pow));
    }
}
