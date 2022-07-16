package com.softuni;

import java.util.*;


public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for(int i=1; i<=num; i++)
        {
            int sum = 0;
            String strNum = Integer.toString(i);
            for(int j=0; j<strNum.length(); j++){
                int toAdd = Character.getNumericValue(strNum.charAt(j));
                sum += toAdd;
            }

            if(sum == 7 || sum == 11 || sum == 5){
                System.out.printf("%d -> True\n",i);
            }
            else{
                System.out.printf("%d -> False\n",i);
            }
        }
    }
}
