/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese el año actual\n>>>");
        int añoact=entrada.nextInt();
        System.out.print("Ingrese el año de su nacimiento\n>>>");
        int añonac=entrada.nextInt(); 
        int edad = añoact-añonac;
        System.out.print("su edad actual es de: " + edad);
         
    
    }
    
}
