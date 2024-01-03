/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_4_Frames;

/**
 *
 * @author santi
 */
public class Vehiculo {
    String Nombre;
    String modelo;
    int anio;
    int precio;

    public String getMarca() {
        return Nombre;
    }

    public void setMarca(String marca) {
        this.Nombre = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Vehiculo(String marca, String modelo, int anio, int precio) {
        this.Nombre = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + Nombre + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio + '}';
    }
    
}
