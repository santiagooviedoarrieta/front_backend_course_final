/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebajs.prueba;

/**
 *
 * @author santi
 */
public class Usuario {
    String nombre;
    String contra;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Usuario(String nombre, String contra) {
        this.nombre = nombre;
        this.contra = contra;
    }
    
}
