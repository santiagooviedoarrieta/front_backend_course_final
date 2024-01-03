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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese la primera nota\n>>>");
        int nota1=entrada.nextInt();
        System.out.print("Ingrese la segunda nota\n>>>");
        int nota2=entrada.nextInt(); 
        float promedio = (nota1+nota2)/2;
        System.out.print("el promedio entre sus 2 notas es de: " + promedio);
         
    
    }
    
}
