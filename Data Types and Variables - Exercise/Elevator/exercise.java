package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int capacity = scanner.nextInt();
        int courses = (int) Math.ceil((double) people / capacity);
        System.out.println(courses);
    }
}
