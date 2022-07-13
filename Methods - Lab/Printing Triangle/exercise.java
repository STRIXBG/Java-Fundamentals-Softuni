package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = Integer.parseInt(scanner.nextLine());
        printTriangle(len);
    }
    private static void printLine(int len){
        for(int i=1; i<=len; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void printTriangle(int len) {
        for(int i=0; i<len; i++){
            printLine(i);
        }
        printLine(len);
        for(int i=len-1; i>=0; i--){
            printLine(i);
        }
    }
}
