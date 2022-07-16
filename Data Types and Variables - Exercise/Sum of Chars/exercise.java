package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for(int i=0; i<n; i++){
            char ch = scanner.next().charAt(0);
            sum += ch;
        }
        System.out.println("The sum equals: " + sum);
    }
}
