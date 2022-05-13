package com.softuni;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt(); int end = scanner.nextInt();
        StringBuilder str = new StringBuilder();
        for(int i = start; i<= end; i++){
            str.append((char)i).append(' ');
        }
        System.out.println(str);
    }
}
