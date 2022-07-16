package com.softuni;

import java.util.*;


public class Exercise {
    private static String repeatString(String str, int count){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<count; i++){
            result.append(str);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = scanner.nextInt();
        String result = repeatString(str, count);
        System.out.println(result);
    }
}
