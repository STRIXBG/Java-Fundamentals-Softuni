package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Integer.parseInt(scanner.nextLine());
        double kilometers = meters/100;
        System.out.printf("%.2f",kilometers);
    }
}
