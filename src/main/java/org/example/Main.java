package org.example;

public class Main {
    public static void main(String[] args) {
        Car c1=new Car("BMW","sedan",1999,4,20);
        Track t=new Track("Kamaz", "big",2013,8,25,2000);
        Motocycle m=new Motocycle("Yamacha", "usual",2020,15 );
        c1.run();
        t.run();
        m.run();
        c1.checkMachine();
        t.checkMachine();
        m.checkMachine();
        System.out.println("You need have next technical inspection after " +c1.timeForNextInspection()+" year");
        System.out.println("You need have next technical inspection after " +t.timeForNextInspection()+" year");
        System.out.println("You need have next technical inspection after " +m.timeForNextInspection()+" year");
    }
}