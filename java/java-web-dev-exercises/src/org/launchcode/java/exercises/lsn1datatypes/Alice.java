package org.launchcode.java.exercises.lsn1datatypes;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?'";
        sentence = sentence.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to search for in the first sentence of 'Alice's Adventures" +
                " in Wonderland': ");
        String searchTerm = input.nextLine();

        searchTerm = searchTerm.toLowerCase();
//        System.out.println(sentence.contains(searchTerm));

        int index = sentence.indexOf(searchTerm);
        int length = searchTerm.length();

        System.out.println("Your search term first appears at index " + index + " and is " + length +
                " characters long.");
        String updatedSentence = sentence.replace(searchTerm, "");
        System.out.println(updatedSentence);
    }
}
