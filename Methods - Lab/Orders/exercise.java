package com.softuni;

import java.util.*;


public class Exercise {
    private static void order(String product, int quanity){
        double price = 0.0;
        switch (product){
            case "coffee":
                price = quanity*1.50;
                break;
            case "water":
                price = quanity*1.00;
                break;
            case "coke":
                price = quanity*1.40;
                break;
            case "snacks":
                price = quanity*2.00;
                break;
        }
        System.out.printf("%.2f", price);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quanity = scanner.nextInt();
        order(product,quanity);
    }
}
