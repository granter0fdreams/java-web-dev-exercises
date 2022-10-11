package org.launchcode.java.exercises.technology;

public abstract class AbstractEntity {

    private static int counter = 1;
    private int id;

    public AbstractEntity(){
        this.id = counter;
        counter++;
    }

    public int getId() {
        return id;
    }
}
