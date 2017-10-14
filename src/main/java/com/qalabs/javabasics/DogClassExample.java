package com.qalabs.javabasics;
class Dog {
    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("%s has %d years and in dogs time %d", this.name, this.age, this.ageToDogYear());
    }
    private int ageToDogYear(){
    //protected int ageToDogYear(){
        return this.age*7;
    }
}




public class DogClassExample {

    public static void main (String[] args) {
        Dog myDog = new Dog("Jenny", 12);
        //myDog.ageToDogYear(); no lo ve en otra clase por que es privado
        System.out.println(myDog.toString());
    }
}
