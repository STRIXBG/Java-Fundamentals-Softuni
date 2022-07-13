package com.softuni;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = Integer.parseInt(scanner.nextLine());
        boolean redInputFirst = true;
        ArrayList<String> redArray = new ArrayList<>();
        ArrayList<String> blueArray = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter next row: ");
            int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(redInputFirst){
                redArray.add(Integer.toString (numbers[0]) );
                blueArray.add(Integer.toString (numbers[1]) );
            }
            else{
                blueArray.add(Integer.toString (numbers[0]) );
                redArray.add(Integer.toString (numbers[1]) );
            }
            if(redInputFirst) redInputFirst=false; else redInputFirst=true;
        }
        System.out.println(String.join(" ", redArray));
        System.out.println(String.join(" ", blueArray));
    }
}
