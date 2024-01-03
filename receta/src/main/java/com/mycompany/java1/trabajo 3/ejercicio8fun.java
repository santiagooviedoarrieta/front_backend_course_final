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
public class ejercicio8fun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias;
        int horas;
        int minutos;
        int diaseg;
        int cant_seg;
        int horaseg;
        int minutoseg;
        System.out.print("Ingrese la cantidad de dias,horas y minutos en ese orden\n>>> ");
        dias = sc.nextInt();
        System.out.print(">>> ");
        horas = sc.nextInt();
        System.out.print(">>> ");
        minutos = sc.nextInt();
        diaseg=((dias*24)*60)*60;
        horaseg= (horas*60)*60;
        minutoseg= minutos*60;
        cant_seg= diaseg + horaseg + minutoseg;
        System.out.print("La cantidad de segundos pasados son: " + cant_seg + "s");
    }
    
}
