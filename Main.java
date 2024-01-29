package org.example;
import leer.*;
public class Main {
    public static void main(String[] args) {
        int opcion = Leer.leerEntero("Introduce una opción: ");
        switch(opcion){
            case 1:
                Ejercicio1.ejercicio1();
        }
    }
}