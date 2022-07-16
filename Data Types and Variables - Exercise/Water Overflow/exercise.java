package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterTank = 255;
        int poured = 0;
        int lines = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<lines; i++){
            int toPour = scanner.nextInt();
            if(poured + toPour > 255){
                System.out.println("Insufficient capacity!");
            }
            else{
                poured+=toPour;
            }
        }
        System.out.println(poured);
    }
}
