
package com.mycompany.java1.arrays;

import java.util.Scanner;

public class ejercicio2arrays {

    
    public static void main(String[] args) {
       int [] numeros = new int[10];
      Scanner sc = new Scanner(System.in);
      int cont=0;
        System.out.println("Ingresa 10 números enteros: ");
        for(int i = 0; i < numeros.length; i++) {
        numeros[i] = sc.nextInt();
                
        }
        System.out.print("Ingrese el numero a buscar \n>>>");
        int num_a_busc = sc.nextInt();
        for(int i = 0; i < numeros.length; i++) {
            if (num_a_busc == numeros[i]) {
                System.out.println("El elemento "+ num_a_busc +" se encontro en el array en la posicion  "+ (i + 1) );
                cont++;
       
            }       
        }
        if (cont==0){
            System.out.println("El elemento "+ num_a_busc + " no se encontro en el array");
            }
       }
   
}
