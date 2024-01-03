/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio7arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_ENCUESTADOS = 30;
        int[] sueldos = new int[NUM_ENCUESTADOS];

        for (int i = 0; i < NUM_ENCUESTADOS; i++) {
            System.out.print("Introduce el sueldo del encuestado " + (i + 1) + ": ");
            sueldos[i] = sc.nextInt();
        }

        Arrays.sort(sueldos);

        System.out.println("Sueldos ordenados de forma creciente: " + Arrays.toString(sueldos));

        int sueldoMaximo = sueldos[NUM_ENCUESTADOS - 1];
        int sueldoMinimo = sueldos[0];
        System.out.println("Sueldo máximo: " + sueldoMaximo);
        System.out.println("Sueldo mínimo: " + sueldoMinimo);

        double mediaSueldos = 0;
        for (int i = 0; i < NUM_ENCUESTADOS; i++) {
            mediaSueldos += sueldos[i];
        }
        mediaSueldos /= NUM_ENCUESTADOS;
        System.out.println("Media de sueldos: " + mediaSueldos);
    }
}