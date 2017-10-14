package com.qalabs.javabasics;

interface Vehicle {
    void speedUp();
    void printSpec();
}

class Tank implements Vehicle {
    private int speed;

    Tank() {
        this.speed = 0;
    }
    public void speedUp() {
        this.speed += 1;
        System.out.println(String.format("Tank speed %s", this.speed));
    }
    public void printSpec(){
        System.out.println(String.format("Tank spec"));
    }
}

class Truck implements Vehicle{
    private int speed;

    Truck(){this.speed=0;}
    public  void speedUp(){
        this.speed+=5;
        System.out.println(String.format("Truck speed %S", this.speed));
    }
    public void printSpec(){
        System.out.println(String.format("Truck spec"));
    }

}

public class InterfaceExample {
    public static void main (String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.speedUp();
        myVehicle.speedUp();
        myVehicle = new Truck();
        myVehicle.speedUp();
        myVehicle.speedUp();
    }
}
