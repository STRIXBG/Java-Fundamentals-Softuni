package com.softuni;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int currentNum = 1;
        for (int i = 0; i < num; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < currentNum; j++) {
                str.append(currentNum).append(' ');
            }
            currentNum += 1;
            System.out.println(str);
        }
    }
}
