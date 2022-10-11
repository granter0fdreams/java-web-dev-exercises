package org.launchcode.java.exercises.technology;

public class Computer extends AbstractEntity {

    private int storage;
    private int ram;
    private String brand;

    public Computer(int storage, int ram, String brand) {
        this.storage = storage;
        this.ram = ram;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void makeNoise(){
        System.out.println("Bedoop");
    }

    public void addRam(int ram){
        this.ram += ram;
    }
}
