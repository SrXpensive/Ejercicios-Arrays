package org.example;

import java.util.*;

public class Ejercicio1 {
    public static void ejercicio1(){
        int [] pares = new int [100];
        int num = 2;
        for(int i = 0; i < pares.length; i++){
            pares[i] = num;
            num +=2;
            }
        for (int i = pares.length-1; i > pares.length-30 ;i--){
            System.out.print(pares[i]+" ");
        }

        }
    }

