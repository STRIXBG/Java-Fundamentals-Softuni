package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());
        printInWords(grade);
    }
    private static void printInWords(int grade) {
         if(grade >= 2.00 & grade <= 2.99){
             System.out.println("Fail");
         }
         else if(grade >= 3.00 && grade <= 3.99){
             System.out.println("Poor");
        }
         else if(grade >= 4.00 && grade <= 4.99){
             System.out.println("Good");
         }
         else if(grade >= 5.00 && grade <= 5.99){
             System.out.println("Very Good");
         }
         else if(grade == 6.00){
             System.out.println("Excellent");
         }
    }
}
