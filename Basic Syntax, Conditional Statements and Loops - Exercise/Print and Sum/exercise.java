package com.softuni;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int sum = 0;
        StringBuilder numbers = new StringBuilder();
        for(int i=start; i <= end; i ++) {
            numbers.append(i).append(' ');
            sum += i;
        }
        System.out.println(numbers);
        System.out.printf("Sum: %d",sum);
    }
}
