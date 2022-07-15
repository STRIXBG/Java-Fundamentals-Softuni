package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("upper-case");
        }
        else{
            System.out.println("lower-case");
        }
    }
}
