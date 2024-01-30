package org.example;

import leer.Leer;

public class Ejercicio4 {
    public static void ejercicio4(){
        int horas;
        int dia;
        int opcion;
        int hora;
        int indice=0;
        double sumaTemp = 0;
        double mediaTemp;
        double sumaHora = 0;
        double mediaHora;
        double mediaTotal;
        double [][] temp = new double [30][4];
        do {
            dia = Leer.leerEntero("¿De qué día quieres introducir las temperaturas?: ");
            if(dia!=0){
                horas = 0;
                for (int i = 0; i < temp[0].length; i++) {
                    temp[dia-1][i] = Leer.leerDouble("Introduce la temperatura de las " + horas+": ");
                    horas += 6;
                    }
            }
        }while(dia!=0);
        do{
            System.out.println("1. Temperatura media de un día elegido");
            System.out.println("2. Temperatura media de una hora del mes elegida");
            System.out.println("3. Temperatura media del mes");
            System.out.println("4. Salir");
            opcion = Leer.leerEntero("Introduce una opción: ");
            switch(opcion){
                case 1:
                    dia = Leer.leerEntero("Introduce el día(1-30): ");
                    for(int i = 0; i<temp[0].length; i++){
                        sumaTemp += temp[dia-1][i];
                    }
                    mediaTemp = sumaTemp/4;
                    System.out.println("La media de temperaturas del dia "+dia+" es "+mediaTemp);
                    break;
                case 2:
                    hora = Leer.leerEntero("Introduce la hora (0,6,12,18) de la que quieres obtener la media: ");
                    if(hora==0){
                        indice=0;
                    }else if(hora==6){
                        indice=1;
                    }else if(hora==12){
                        indice=2;
                    }else if(hora==18){
                        indice=3;
                    }
                    for(int i = 0; i< temp.length; i++){
                        sumaHora += temp[i][indice];
                    }
                    mediaHora = sumaHora/30;
                    System.out.println("La media de temperaturas a las "+hora+" es "+mediaHora);
                    break;
                case 3:
                    double sumaTotal = 0;
                    for(int i = 0; i <temp.length;i++){
                        for (int j = 0; j< temp[0].length; j++){
                            sumaTotal += temp[i][j];
                        }
                    }
                    mediaTotal = sumaTotal/(30*4);
                    System.out.println("La media total del mes es: "+mediaTotal);
            }
        }while(opcion!=4);
    }
}
