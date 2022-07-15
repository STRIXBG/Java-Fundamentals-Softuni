package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        char c = scanner.next().charAt(0);
        String stringResult = "";
        stringResult += a+""+b+""+c;
        System.out.printf("%s",stringResult);
    }
}
