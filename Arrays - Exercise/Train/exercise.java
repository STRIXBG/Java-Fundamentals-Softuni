package com.softuni;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWagons = scanner.nextInt();
        StringBuilder peopleInWagons = new StringBuilder();
        int sum=0;
        for(int i=0; i<countWagons; i++){
            int num = scanner.nextInt();
            sum += num;
            peopleInWagons.append(num).append(' ');
        }
        System.out.println(peopleInWagons);
        System.out.println(sum);
    }
}
