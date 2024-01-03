/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java1.arrays;

import java.util.Scanner;

public class ejercicio6arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca cuantos numeros va a querer ingresar \n>>>");
        int n = sc.nextInt();

        int sumPositivos = 0;
        int sumNegativos = 0;
        int numCeros = 0;
        int numPositivos = 0;
        int numNegativos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce un número \n>>>");
            int num = sc.nextInt();

            if (num > 0) {
                sumPositivos += num;
                numPositivos++;
            } else if (num < 0) {
                sumNegativos += num;
                numNegativos++;
            } else {
                numCeros++;
            }
        }

        if (numPositivos > 0) {
            double mediaPositivos = (double) sumPositivos / numPositivos;
            System.out.println("La media de los números positivos es: " + mediaPositivos);
        } else {
            System.out.println("No hay numeros positivos");
        }

        if (numNegativos > 0) {
            double mediaNegativos = (double) sumNegativos / numNegativos;
            System.out.println("La media de los números negativos es: " + mediaNegativos);
        } else {
            System.out.println("No hay numeros negativos");
        }

        System.out.println("Se introdujeron " + numCeros + " ceros.");
    }
}
