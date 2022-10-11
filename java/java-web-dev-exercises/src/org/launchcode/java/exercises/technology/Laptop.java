package org.launchcode.java.exercises.technology;

public class Laptop extends Computer{

    private boolean hasFullSizeKeyboard;

    public Laptop(int storage, int ram, String brand, boolean hasFullSizeKeyboard) {
        super(storage, ram, brand);
        this.hasFullSizeKeyboard = hasFullSizeKeyboard;
    }

    @Override
    public void makeNoise(){
        System.out.println("ding ding ding");
    }
}
