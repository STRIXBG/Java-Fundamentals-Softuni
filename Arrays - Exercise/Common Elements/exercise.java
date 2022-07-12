package com.softuni;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first line: ");
        String input = scanner.nextLine();
        String[] firstArr = input.split(" ");
        System.out.println("Enter second line: ");
        input = scanner.nextLine();
        String[] secondArr = input.split(" ");
        Set<String> common = new HashSet<>();
        for (String s : firstArr) {
            for (String s2 : secondArr) {
                if (s.equals(s2)) {
                    common.add(s);
                }
            }
        }
        String result = String.join(" ", common);
        System.out.println(result);
    }
}
