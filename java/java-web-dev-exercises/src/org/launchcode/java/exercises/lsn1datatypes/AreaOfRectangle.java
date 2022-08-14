package org.launchcode.java.exercises.lsn1datatypes;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.println("Please enter the width of the rectangle: ");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("A rectangle of length " + length + " and width of " + width + " has an area of " + area + ".");
    }
}
