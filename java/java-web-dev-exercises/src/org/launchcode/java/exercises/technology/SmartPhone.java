package org.launchcode.java.exercises.technology;

public class SmartPhone extends Computer{

    private String phoneNumber;

    public SmartPhone(int storage, int ram, String brand, String phoneNumber) {
        super(storage, ram, brand);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void makeNoise(){
        System.out.println("heyo");
    }
}
