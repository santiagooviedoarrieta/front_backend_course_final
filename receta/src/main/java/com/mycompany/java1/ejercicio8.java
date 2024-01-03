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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado;
        double altura;
        double perimetro;
        double area;
        
        
        System.out.println("Ingrese el valor del lado del rectángulo:");
        lado = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura del rectángulo: ");
        altura = sc.nextDouble();
        
       
        perimetro = 2 * (lado + altura);
        area = lado * altura;
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);
    }
    
}
