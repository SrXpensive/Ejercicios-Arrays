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
        System.out.println(Arrays.toString(pares));
        }
    }

