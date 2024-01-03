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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese el kilo de manzanas que tiene\n>>>");
        float kmanzanas=entrada.nextFloat();
        System.out.print("Ingrese el kilo de peras que tiene\n>>>");
        float kperas=entrada.nextFloat(); 
        float precmanz= (float) 2.35;
        float precper = (float) 1.95;
        float kil_manz_tot=kmanzanas*precmanz;
        float kil_per_tot=kperas*precper;
        int precperas = Math.round(kil_per_tot);
        int precman = Math.round(kil_manz_tot);
        System.out.println("el beneficio de los kilos de manzanas son: "+ precman +"$" );
        System.out.print("el beneficio de los kilos de pera son: "+ precperas + "$" );
         
    }
    
}
