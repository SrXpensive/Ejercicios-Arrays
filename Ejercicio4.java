package org.example;

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
        double mediaTotal = 0;
        double nuevaTemp;
        double [][] temp = new double [30][4];
        do {
            dia = Leer.leerEntero("¿De qué día quieres introducir las temperaturas?(0 para dejar de introducir dias): ");
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
            System.out.println("4. Temperatura de un dia y una hora en concreto");
            System.out.println("5. Temperatura mínima y máxima de un día");
            System.out.println("6. Cambiar la temperatura de un día y una hora");
            System.out.println("7. Salir");
            opcion = Leer.leerEntero("Introduce una opción: ");
            switch(opcion){
                case 1:
                    dia = Leer.leerEntero("Introduce el día(1-30): ");
                    sumaTemp=0;
                    for(int i = 0; i<temp[0].length; i++){
                        sumaTemp += temp[dia-1][i];
                    }
                    mediaTemp = sumaTemp/4;
                    System.out.println("La media de temperaturas del dia "+dia+" es "+mediaTemp);
                    System.out.println("---------------");
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
                    sumaHora=0;
                    for(int i = 0; i< temp.length; i++){
                        sumaHora += temp[i][indice];
                    }
                    mediaHora = sumaHora/30;
                    System.out.println("La media de temperaturas a las "+hora+" es "+mediaHora);
                    System.out.println("---------------");
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
                    System.out.println("---------------");
                    break;
                case 4:
                    dia = Leer.leerEntero("Introduce el día que quieres consultar: ");
                    hora = Leer.leerEntero("Introduce la hora del día (0,6,12,18): ");
                    if(hora==0){
                        indice=0;
                    }else if(hora==6){
                        indice=1;
                    }else if(hora==12){
                        indice=2;
                    }else if(hora==18){
                        indice=3;
                    }
                    System.out.println("La temperatura del dia "+dia+" a la hora "+hora+" fue "+temp[dia-1][indice]);
                    System.out.println("---------------");
                    break;
                case 5:
                    double min = 100;
                    double max = -100;
                    dia = Leer.leerEntero("Introduce el día del cual quieres saber la temperatura mínima y máxima: ");
                    for (int i = 0; i < temp[0].length; i++){
                        if (temp[dia-1][i] > max){
                            max = temp[dia-1][i];
                        }
                        if (temp[dia-1][i] < min){
                            min = temp[dia-1][i];
                        }
                    }
                    System.out.println("La temperatura mínima del día "+dia+" es "+min+" y la máxima es "+max);
                    System.out.println("---------------");
                    break;
                case 6:
                    dia = Leer.leerEntero("¿De qué día quieres cambiar la temperatura?: ");
                    hora = Leer.leerEntero("¿Y de qué hora?: ");
                    if(hora==0){
                        indice=0;
                    }else if(hora==6){
                        indice=1;
                    }else if(hora==12){
                        indice=2;
                    }else if(hora==18){
                        indice=3;
                    }
                    nuevaTemp = Leer.leerEntero("Introduce la nueva temperatura: ");
                    temp[dia-1][indice] = nuevaTemp;
                    System.out.println("Ahora la temperatura del dia "+dia+" a las "+hora+" horas es "+temp[dia-1][indice]);
                    System.out.println("---------------");
                    break;
            }
        }while(opcion!=7);
    }
}
