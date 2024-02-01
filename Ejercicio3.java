package org.example;

import leer.Leer;


public class Ejercicio3 {
    public static void ejercicio3(){
        int filas = 2;
        int exp;
        String datos;
        String [] alumno;
        int [][] alumnes = new int [filas][3];
        for (int i = 0; i < alumnes.length; i++){
            datos = Leer.leerTexto("Dime el número de expediente, la nota y la edad del alumno "+(i+1)+": ");
            alumno = datos.split(" ");
            for (int j = 0; j < alumno.length; j++){
                alumnes[i][j] = Integer.parseInt(alumno[j]);
            }
        }
        System.out.print("Número\tExpediente\tNota\tEdat");
        System.out.println();
        System.out.print("======\t==========\t====\t====");
        System.out.println();
        for (int i = 0; i < alumnes.length; i++){
            System.out.printf("%6d %8d %6d %8d\n",i,alumnes[i][0],alumnes[i][1],alumnes[i][2]);
        }
        System.out.println();

        exp = Leer.leerEntero("Introduce el número de expediente que quieres consultar: ");
        for (int i=0;i<alumnes.length;i++){
            if(exp == alumnes[i][0]){
                System.out.println("El alumno con expediente "+exp+" tiene una nota de "+alumnes[i][1]+" y "+alumnes[i][2]);
            }
        }
    }
}
