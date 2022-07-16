package com.softuni;

import java.util.*;


public class Exercise {
    private static double getRectangleArea(double width, double length){
        return width*length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        double area = getRectangleArea(width,length);
        System.out.printf("%.0f",area);
    }
}
