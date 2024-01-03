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
public class ejercicio2estr {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        double comidaDiaria;
        int numAnimales;
        double kilosPorAnimal;
        double comidaSuficiente;
        double relacionKilos;
        System.out.println("Ingrese la cantidad diaria de comida en kilos: ");
        comidaDiaria = sc.nextDouble();
        System.out.println("Ingrese el número de animales: ");
        numAnimales = sc.nextInt();
        System.out.println("Ingrese la cantidad promedio de kilos de comida que come cada animal: ");
        kilosPorAnimal = sc.nextDouble();
        comidaSuficiente = numAnimales * kilosPorAnimal;
        relacionKilos = comidaDiaria / comidaSuficiente;
      
        if (relacionKilos >= 1) {
            System.out.println("Hay suficiente comida para cada animal.");
        } else {
            System.out.println("No hay suficiente comida para cada animal.");
            System.out.println("La relación de kilos de comida por animal es: " + relacionKilos);
        }
    }
    }
