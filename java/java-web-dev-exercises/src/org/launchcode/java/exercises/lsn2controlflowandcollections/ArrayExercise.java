package org.launchcode.java.exercises.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args){
        ArrayExercise arrayExercise = new ArrayExercise();
        arrayExercise.printOddNumbers();
        arrayExercise.splitAGivenString();
        arrayExercise.splitAGivenStringIntoSentences();
    }

    public void printOddNumbers(){
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i : integerArray){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }

    public String[] splitAGivenString(){
        String givenString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentenceArray = givenString.split(" ");
//        System.out.println(Arrays.toString(sentenceArray));
        return sentenceArray;
    }

    public void splitAGivenStringIntoSentences(){
        String givenString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] secondSentenceArray = givenString.split("\\.");
        System.out.println(Arrays.toString(secondSentenceArray));
    }
}
