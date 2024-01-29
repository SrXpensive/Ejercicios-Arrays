package org.example;
import leer.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        int opcion = Leer.leerEntero("Introduce una opción: ");
        switch(opcion){
            case 1:
                Ejercicio1.ejercicio1();
            case 2:
                Ejercicio2.ejercicio2();
        }
    }
}