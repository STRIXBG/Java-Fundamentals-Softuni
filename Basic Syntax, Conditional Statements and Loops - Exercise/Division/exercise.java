package com.softuni;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num % 10 == 0){
            System.out.println("The number is divisible by 10");
        }
        else if(num % 7 == 0){
            System.out.println("The number is divisible by 7");
        }
        else if(num % 6 == 0){
            System.out.println("The number is divisible by 6");
        }
        else if(num % 3 == 0){
            System.out.println("The number is divisible by 3");
        }
        else if(num % 2 == 0){
            System.out.println("The number is divisible by 2");
        }
    }
}
