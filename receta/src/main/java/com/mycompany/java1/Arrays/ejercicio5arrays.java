
package com.mycompany.java1.arrays;

import java.util.Scanner;


public class ejercicio5arrays {

    
    public static void main(String[] args) {
        
       int [] numeros = new int[10];
      Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 10 números enteros: ");
        for(int i = 0; i < numeros.length; i++) {
        numeros[i] = sc.nextInt();
        }


        float suma = 0;
        float promedio=0;
        for(int i = 0; i < numeros.length; i++) {
        suma += numeros[i];
        promedio=suma/10;
        }


        System.out.println("El promedio de sus numeros es de: " + promedio);
   
        
    }
    
}
