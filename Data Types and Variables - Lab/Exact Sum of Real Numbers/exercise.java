package com.softuni;

import java.math.BigDecimal;
import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        BigDecimal result = new BigDecimal("0");
        for(int i=0; i<lines; i++) {
            BigDecimal toAdd = new BigDecimal(scanner.nextLine());
            result = result.add(toAdd);
        }
        System.out.println(result);
    }
}
