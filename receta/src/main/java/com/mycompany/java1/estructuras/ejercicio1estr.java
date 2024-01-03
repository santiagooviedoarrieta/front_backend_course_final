/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java1.estructuras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio1estr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de DNI\n>>> ");
        int numeroDNI = sc.nextInt();
        int modulo23 = numeroDNI % 23;
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letraDNI = letrasDNI[modulo23];
        System.out.println("La letra del DNI " + numeroDNI + " es: " + letraDNI);
    }
}

