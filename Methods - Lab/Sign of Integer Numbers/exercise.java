package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        signOfInt(num);
    }
    private static void signOfInt(int number) {
        if(number > 0){
            System.out.printf("The number %d is positive.", number);
        }
        else if(number == 0){
            System.out.printf("The number %d is zero.", number);
        }
        else{
            System.out.printf("The number %d is negative.", number);
        }
    }
}
