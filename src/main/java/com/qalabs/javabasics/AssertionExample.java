package com.qalabs.javabasics;


public class AssertionExample {
    public static void main (String[] args) {
        int age = 18;
        String name = "Diego", name2="Diego";

        //assert age >= 27;
        //assert  1 > 5: "Un minuto no menos 5 minutos";
        assert name.equals(name2): "Tu cadena nombre  es igual a la mia";
        //assert age==name: "El numero es igual a la cadena";
        assert (age>=20 && age <= 30): "No tienes entre 20 y 30 anios";
    }
}



