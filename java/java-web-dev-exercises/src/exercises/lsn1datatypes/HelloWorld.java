package exercises.lsn1datatypes;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Heyo! What's your name?");
        String name = input.nextLine();
        System.out.println("Hey " + name + "!");
    }
}
