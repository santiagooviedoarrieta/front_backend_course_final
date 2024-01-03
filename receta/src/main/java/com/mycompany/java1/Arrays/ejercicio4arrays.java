
package com.mycompany.java1.Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class ejercicio4arrays {

    
    public static void main(String[] args) {
        int [] numeros = new int[10];
      Scanner sc = new Scanner(System.in);
      int cont=0;
        System.out.println("Ingresa 10 números enteros: ");
        for(int i = 0; i < numeros.length; i++) {
        numeros[i] = sc.nextInt();
                
        }
        System.out.print("Ingrese el numero a eliminar \n>>>");
        int num_a_elimin = sc.nextInt();
        int elimin_num= -1;
        for(int i = 0; i < numeros.length; i++) {
            if (num_a_elimin == numeros[i]) {
                cont++;
                elimin_num=i;
                break;
            }       
        }
        if (elimin_num != -1) {
            int[] numeros_sin_eliminado = new int[numeros.length - 1];
            System.arraycopy(numeros, 0, numeros_sin_eliminado, 0, elimin_num);
            System.arraycopy(numeros, elimin_num + 1, numeros_sin_eliminado, elimin_num, numeros.length - elimin_num - 1);
            numeros = numeros_sin_eliminado; 
        }
        if (cont==0){
            System.out.println("El elemento "+ num_a_elimin + " no se encontro en el array");
            }
    System.out.println("Su array con el numero eliminado quedaria asi: " + Arrays.toString(numeros));
    }
    
}
