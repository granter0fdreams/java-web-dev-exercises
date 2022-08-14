package exercises.lsn1datatypes;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles you have driven: ");
        double miles = input.nextDouble();
        System.out.println("Please enter the number of gallons of gasoline your vehicle has consumed: ");
        double gallons = input.nextDouble();
        double milesPerGallon = miles / gallons;
        System.out.println("Your average miles per gallon for this trip was " + milesPerGallon + ".");
    }
}
