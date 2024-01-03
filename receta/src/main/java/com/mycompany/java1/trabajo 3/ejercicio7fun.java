/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java1.estructuras;
import java.util.Scanner;
public class ejercicio7fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad1;
        int superficie;
        double pi;
         pi=3.14;
        int volumen;
        while (true){
            System.out.print("Seleccione una opcion: \n1.Calcular Superficie \n2.Calcular Volumen\n3.Calcular Superficie y Volumen\n4.Salir \n>>> " );
            int opcion1 = sc.nextInt();
                    if (opcion1==1) {
                        System.out.println("Opcion elejida 1");
                        System.out.print("Ingrese el radio de la esfera\n>>>" );
                        rad1 = sc.nextInt();
                        superficie = (int) ((4*pi)*(rad1*rad1)) ;
                        System.out.print("La superficie de su esfera es de: " + superficie );
                    } else {
                        if (opcion1==2){
                            System.out.println("Opcion elejida 2");
                            System.out.print("Ingrese el radio de la esfera\n>>>" );
                            rad1 = sc.nextInt();
                            volumen= (int) (((4/3)*pi)*(rad1*rad1*rad1));
                            System.out.print("El volumen de su esfera es de: " + volumen );
                        } else{
                           if (opcion1==3){
                        System.out.println("Opcion elejida: 3");
                            System.out.print("Ingrese el radio de la esfera\n>>>" );
                            rad1 = sc.nextInt();
                            volumen= (int) (((4/3)*pi)*(rad1*rad1*rad1));
                            System.out.println("El volumen de su esfera es de: " + volumen );
                            superficie = (int) ((4*pi)*(rad1*rad1)) ;
                            System.out.println("La superficie de su esfera es de: " + superficie );
                        } else {
                           if (opcion1==4){
                            System.out.print("Opcion elejida: Salir");
                            break;
                        } else {
                               System.out.println("Opcion no valida");
                               
                           }
                           }
                        }
                    }
        }
    }
}
    

