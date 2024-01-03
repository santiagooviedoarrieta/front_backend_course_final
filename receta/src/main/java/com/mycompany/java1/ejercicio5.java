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
public class ejercicio5 {
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese la primera nota\n>>>");
        int nota1=entrada.nextInt();
        System.out.print("Ingrese la segunda nota\n>>>");
        int nota2=entrada.nextInt(); 
        System.out.print("Ingrese la tercera nota\n>>>");
        int nota3=entrada.nextInt();
        float promedio= (nota1+nota2+nota3)/3;
        int promfin = Math.round(promedio);
        System.out.print("el promedio entre sus 3 notas es de: " + promfin);
         
    }
    
}
