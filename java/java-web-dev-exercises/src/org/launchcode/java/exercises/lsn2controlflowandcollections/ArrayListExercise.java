package org.launchcode.java.exercises.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args){
//        ArrayList<Integer> someIntegers = new ArrayList<Integer>(Arrays.asList(314, 618, 636, 904, 212, 201, 217, 901, 789, 405));
//        Integer theSum = ArrayListExercise.sumEven(someIntegers);
//        System.out.println(theSum);

        ArrayExercise arrayExercise = new ArrayExercise();
        String [] returnedWords = arrayExercise.splitAGivenString();

        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList(returnedWords));
        System.out.println("Enter a word length: ");
        Integer searchLength = ArrayListExercise.getUserSearchInput();
        ArrayListExercise.printWordsWithFiveLetters(wordsToSearch, searchLength);

    }

    public static Integer getUserSearchInput(){
        Scanner scanner = new Scanner(System.in);
        Integer userInteger = scanner.nextInt();
        scanner.close();
        return userInteger;
    }
    public static void printWordsWithFiveLetters(ArrayList<String> wordsArray, Integer searchLength){
        for (int i=0; i<wordsArray.size(); i++){
            if (wordsArray.get(i).length() == searchLength) {
                System.out.println(wordsArray.get(i));
            }
        }
    }

    public static Integer sumEven(ArrayList<Integer> someArray) {
        int total = 0;
        for (int integer : someArray) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
