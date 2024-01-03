
package com.mycompany.java1.estructuras;

import java.util.Scanner;

public class ejercicio13fun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero \n>>> ");
        int numero = sc.nextInt();
        int cant_cifras=0;
        if (numero>=0) {
            while (numero!=0) {
                numero = numero/10;
                cant_cifras++;
                
            }
            System.out.print("Su numero tiene: " + cant_cifras + " cifras");
        } else {
             System.out.print("El numero ingresado es negativo o no es valido");
             return;
        }
        }
    
}
