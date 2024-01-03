/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java1.estructuras;
import java.util.Scanner;
public class ejercicio12fun {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero \n>>> ");
        int numero = sc.nextInt();
    String binario = convertir_decimal_a_binario(numero);
    System.out.println("Su numero transformado a binario es: " + binario); 
  }
  public static String convertir_decimal_a_binario(int decimal) {
    if (decimal == 0) {
      return "0";
    }   
    
    String binario = ""; 
    
    while (decimal > 0) {
      int remainder = decimal % 2; 
      binario = remainder + binario; 
      decimal = decimal / 2; 
    }
    return binario;
  }
}

