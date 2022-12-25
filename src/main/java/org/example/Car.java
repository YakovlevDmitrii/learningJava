package org.example;

public class Car implements TechnicalInspection {
    private String brand;
    private String type;
    private int year;
    private int countWheels;
    private Wheels wheels;
    public Car(String brand, String type, int year, int countWheels,double diameter) {
        this.brand = brand;
        this.type = type;
        this.year = year;
        this.countWheels=countWheels;
        this.wheels=new Wheels(countWheels,diameter);
    }
    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }
    public int getYear() {
        return year;
    }
    public Wheels getWheels() {
        return wheels;
    }

    @Override
    public void checkMachine() {
        if (this.year<2000){
            System.out.println("Check all car");
        }
        else{
            System.out.println("Check only engine");
        }
    }

    @Override
    public int timeForNextInspection() {
        if(this.year<2010){
            return 2;
        }
        else {
            return 5;
        }
    }
    void run(){
        System.out.println("I'm car. I'm running");
    }
}
