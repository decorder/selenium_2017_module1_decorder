package com.qalabs.javabasics;


class Bike {
    private String brand;
    private int speed;

    Bike(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    void speedUp() {
        this.speed += 1;
        System.out.println(String.format("%s speed %d", this.brand, this.speed));
    }
//aniadir setter y getter para dejar speed privada
    protected int getSpeed() {
        return this.speed;
    }

    protected void setSpeed(int speed){
        this.speed= speed;
    }
    protected String getBrand(){
        return this.brand;
    }
}

class MountainBike extends Bike {
    private int seatHeight;

    MountainBike(String brand) {
        super(brand);
        this.seatHeight = 0;
    }

    public void setSeatHeight(int newHeight) {
        this.seatHeight = newHeight;
    }
}

class RoadBike extends Bike {
    private String color;

    RoadBike(String brand){
        super(brand);
        this.color="red";
    }

    void speedUp(){
        this.setSpeed(this.getSpeed()+5);
        System.out.println(String.format("%s speed %d", this.getBrand(), this.getSpeed()));
    }
}



public class InheritanceExample {
    public static void main (String[] args) {
        // Hold bike instance into bike variable
        Bike bike = new Bike("bike");
        bike.speedUp();
        bike.speedUp();

        // Hold mountain bike instance into same bike variable, no problem
        bike = new MountainBike("mountain bike");
        bike.speedUp();
        bike.speedUp();

        //nueva instancia
        //Bike bike2=new RoadBike("roadbike");
        bike = new RoadBike("road bike");
        bike.speedUp();
        bike.speedUp();

        bike = new MountainBike("mountain bike");
        bike.speedUp();
        bike.speedUp();
    }
}
