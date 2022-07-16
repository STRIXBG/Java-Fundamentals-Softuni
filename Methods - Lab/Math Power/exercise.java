package com.softuni;

import java.text.DecimalFormat;
import java.util.*;


public class Exercise {
    private static double mathPower(double number, int power) {
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
        System.out.println(new DecimalFormat("0.###").format(mathPower(num, pow)));
    }
}
