package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String name = scanner.nextLine();
            int crypted = 0;
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) == 'a' || name.charAt(j) == 'o' ||
                        name.charAt(j) == 'u' || name.charAt(j) == 'e' || name.charAt(j) == 'i') {
                    char character = name.charAt(j);
                    crypted += (int) character * name.length();
                } else {
                    char character = name.charAt(j);
                    crypted += (int) character / name.length();
                }
            }
            numbers.add(crypted);
        }
        Collections.sort(numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
