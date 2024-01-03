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
public class ejercicio4estr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos, incremento;
        System.out.print("Ingrese la hora actual en el siguiente orden hh : mm : ss)\n>>> ");
        horas = sc.nextInt();
        System.out.print("\n>>> ");
        minutos = sc.nextInt();
        System.out.print("\n>>> ");
        segundos = sc.nextInt();
        System.out.print("Ingrese los segundos a incrementar: ");
        incremento = sc.nextInt();
        segundos += incremento;
        minutos += segundos / 60;
        horas += minutos / 60; 
        segundos %= 60; 
        minutos %= 60;
        horas %= 24; 
        System.out.printf("Nueva hora: %02d:%02d:%02d", horas, minutos, segundos);
    }
}
  
