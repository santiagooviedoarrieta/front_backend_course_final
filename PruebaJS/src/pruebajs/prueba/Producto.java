/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebajs.prueba;

/**
 *
 * @author santi
 */
public class Producto {
    String Nombre;
    int cantidad;
    int precio;
    float precio_total;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public float getPrecioTotal() {
        return precio_total;
    }
    
    public void setPrecioTotal(float precio_total){
        this.precio_total=precio_total;
    } 
    

    public Producto(String nombre, int cantidad, int precio , float precio_total) {
        this.Nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.precio_total= precio_total;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + Nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", precio total=" + precio_total +'}';
    }
    
}
