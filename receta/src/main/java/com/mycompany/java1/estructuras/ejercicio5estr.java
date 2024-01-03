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
public class ejercicio5estr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int numero;
        
        // Solicitamos al usuario el número deseado
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        
        // Mostramos "Eco..." tantas veces como el número introducido
        for (int i = 0; i < numero; i++) {
            System.out.println("Eco...");
        }
    }
}
    
    

