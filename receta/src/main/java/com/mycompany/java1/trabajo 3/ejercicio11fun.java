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
public class ejercicio11fun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero \n>>> ");
        int numero = sc.nextInt();
        int factor = factores(numero);
        System.out.println(factor);
    }
     public static int factores(int num){
        int condicion = 1;
        for (int i = 1; i <= num; i++){
            condicion *= i;
        }
        return condicion;
    }
    
}
