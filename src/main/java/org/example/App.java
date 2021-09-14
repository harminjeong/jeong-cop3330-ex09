/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int feetPerGallon = 350;

        System.out.print("What is the length of the room in feet? ");
        int length = input.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();

        int area = length * width;
        int gallons = area/feetPerGallon;

        if(area%350 > 0) gallons = gallons+1;

        System.out.println("You will need to purchase "+gallons+" gallon(s) of paint to cover "+area+" square feet.");
    }
}
