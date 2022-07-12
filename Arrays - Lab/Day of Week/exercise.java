package com.softuni;

import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int day = scanner.nextInt();
        System.out.println(dayNames[day-1]);
    }
}
