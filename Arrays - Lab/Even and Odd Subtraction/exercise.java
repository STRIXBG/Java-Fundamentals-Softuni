package com.softuni;

import java.util.Arrays;
import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int evenSum = 0, oddSum = 0;
        int diff;
        for(int number : numbers){
            if(number % 2 == 0){
                evenSum+=number;
            }
            else {
                oddSum+=number;
            }
        }
        diff = evenSum-oddSum;
        System.out.println(diff);
    }
}
