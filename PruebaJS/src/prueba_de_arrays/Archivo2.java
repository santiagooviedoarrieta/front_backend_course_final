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

public class Archivo2 {
    public static void main(String[] args) {
        ArrayList<String> listaRecuperada;

        // Deserializar el ArrayList
        try {
            FileInputStream fileIn = new FileInputStream("data.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            listaRecuperada = (ArrayList<String>) in.readObject();
            in.close();
            fileIn.close();

            // Ahora puedes usar listaRecuperada en este archivo
            for (String elemento : listaRecuperada) {
                System.out.println(elemento);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
