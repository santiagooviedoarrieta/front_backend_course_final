/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java1.estructuras;

import java.util.Scanner;


public class ejercicio10fun {

    
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.print("Introduzca un numero \n>>>");
        int numero = sc.nextInt();
        boolean primo = primo(numero);
        System.out.println("Su numero es primo: " + primo);
    }
    public static boolean primo(int num){
        int contador = 0;
        for (int i = 1; i <= num;i++){
            if (num%i == 0){
                contador += 1;
            }
            else{
                
            }
        }
        if (contador < 3){
            return true;
        }
        else{
            return false;
        }
    }
    
}
