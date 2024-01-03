/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_de_arrays;

/**
 *
 * @author santi
 */
import java.io.*;
import java.util.ArrayList;

public class Archivo1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        // Serializar el ArrayList
        try {
            FileOutputStream fileOut = new FileOutputStream("data.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(lista);
            out.close();
            fileOut.close();
            System.out.println("ArrayList serializado en data.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
