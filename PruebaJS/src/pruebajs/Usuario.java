/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebajs;

/**
 *
 * @author santi
 */
public class Usuario {
    String nombre;
    int contra;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContra() {
        return contra;
    }

    public void setContra(int contra) {
        this.contra = contra;
    }

    public Usuario(String nombre, int contra) {
        this.nombre = nombre;
        this.contra = contra;
    }
    
}
