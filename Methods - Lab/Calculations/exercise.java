package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result=0;
        switch (command){
            case "add":
                result = a+b;
                break;
            case "multiply":
                result = a*b;
                break;
            case "subtract":
                result = a-b;
                break;
            case "divide":
                result = a/b;
                break;
        }
        System.out.println(result);
    }
}
