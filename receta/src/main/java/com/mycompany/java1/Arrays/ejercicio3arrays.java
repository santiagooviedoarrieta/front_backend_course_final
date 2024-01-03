
package com.mycompany.java1.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ejercicio3arrays {
 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int[] numeros= new int[10];
        System.out.println("Ingresa 10 números enteros: ");
        for(int i = 0; i < numeros.length; i++) {
        numeros[i] = sc.nextInt();
                
        }
        for(int i = 0; i < numeros.length; i++) {
            for(int j=0 ; j < numeros.length; j++){
                if ((numeros[i]< numeros[j])){
                    int temp=numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=temp;
                }
            }
          
         }
        System.out.println("Su Array ordenado seria: " + Arrays.toString(numeros));
        }
    }
    

