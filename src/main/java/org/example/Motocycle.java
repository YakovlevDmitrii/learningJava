package org.example;

public class Motocycle extends Car{

    private int countWheels=2;

    public Motocycle(String brand, String type, int year, double diameter) {
        super(brand, type, year,2,diameter);
    }
    void run(){
        System.out.println("I'm motorcycle. I'm running");
    }
}
