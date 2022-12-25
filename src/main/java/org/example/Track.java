package org.example;

public class Track extends Car {
    public int getVolumeBag() {
        return volumeBag;
    }

    private int volumeBag;

    public Track(String brand, String type, int year, int countWheels, double diameter, int volume) {
        super(brand, type, year, countWheels, diameter);
        this.volumeBag=volume;
    }
    void run(){
        System.out.println("I'm track. I'm running");
    }

}
