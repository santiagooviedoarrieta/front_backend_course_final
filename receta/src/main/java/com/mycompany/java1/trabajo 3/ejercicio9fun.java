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
public class ejercicio9fun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entre 0 y 50 \n>>>");
        int num = sc.nextInt();
        sc.close();
        
        if (num >= 0 && num < 50) {
            contarHastaCincuenta(num);
        } else {
            System.out.println("El número ingresado no es válido");
        }
    }
    public static void contarHastaCincuenta(int num) {
        System.out.println(num);
        if (num < 50) {
            contarHastaCincuenta(num + 1);
        }
    }
}
