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
public class ejercicio3estr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int numero;
        int centenas;
        int decenas;
        int unidades;
        
        System.out.println("Ingrese un número de tres cifras: ");
        numero = sc.nextInt();
        centenas = numero / 100;
        decenas = (numero % 100) / 10;
        unidades = numero % 10;
        System.out.println("Numero de las centenas: " + centenas);
        System.out.println("Numero de las decenas: " + decenas);
        System.out.println("Numero de las unidades: " + unidades);
    }
    }
