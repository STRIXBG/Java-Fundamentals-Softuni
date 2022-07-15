package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = Integer.parseInt(scanner.nextLine());
        double dollars = pounds*1.36;
        System.out.printf("%.3f",dollars);
    }
}
