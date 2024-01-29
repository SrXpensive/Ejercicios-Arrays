package org.example;

import leer.Leer;

import java.util.Arrays;

public class Ejercicio2 {
    public static void ejercicio2(){
        int [] numeros = new int [10];
        int valor;
        int pos;
        String opcion;
        do{
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valores ");
            System.out.println("c. Salir");
            opcion = Leer.leerTexto("Introduce una opción (a,b,o c): ");
            switch(opcion){
                case "a":
                    System.out.println(Arrays.toString(numeros));
                    break;
                case "b":
                    valor = Leer.leerEntero("Introduce un valor: ");
                    pos = Leer.leerEntero("Ahora introduce una posición para ese valor: ");
                    numeros[pos-1] = valor;
                    break;
            }
            System.out.println("--------------------");

        }while(!opcion.equals("c"));
    }
}
