package com.softuni;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        int[] number = new int[4];
        for(int i=0; i<4; i++){
            int input = scanner.nextInt();
            number[i] = input;
        }
        result = number[0] + number[1];
        result = result / number[2];
        result = result * number[3];
        System.out.println(result);
    }
}
