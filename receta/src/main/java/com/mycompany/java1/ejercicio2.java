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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese su edad\n>>>");
        int edadact=entrada.nextInt();
        int añosig=1;
        int edad = edadact+añosig;
        System.out.print("su edad el proximo año sera de " + edad);
               
        
   }     
    
}
