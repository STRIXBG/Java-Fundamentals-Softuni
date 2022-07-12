package com.softuni;

import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");
        StringBuilder reversed = new StringBuilder();
        int length = split.length;
        int reverseIndex = length-1;
        for(int i=0; i<length; i++){
            reversed.append(split[reverseIndex]).append(' ');
            reverseIndex--;
        }
        System.out.println(reversed);
    }
}
