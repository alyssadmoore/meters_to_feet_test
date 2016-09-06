package com.clara;

import java.util.Scanner;

public class DistanceConverter {

    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please type in a distance in meters:");
        int meters = numberScanner.nextInt();

        int feet = metersToFeet(meters);

        System.out.println("That's " + feet + " ft");

        numberScanner.close();
    }

    public static int metersToFeet(int meters){
        //To convert meters to feet, multiply by 3
        return (meters * 3);
    }
    /* I know doubles would be more real world but we are keeping it simple
     int values are a little easier to test - doubles/float are not as precise */
}