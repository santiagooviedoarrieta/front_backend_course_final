
package com.mycompany.mavenproject1;
public class Caja {
    protected int ancho;
    protected int alto;
    protected int fondo;

    public Caja(int ancho, int alto, int fondo) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }

    public double getVolumen() {
        return ancho * alto * fondo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public int getFondo() {
        return fondo;
    }

    @Override
    public String toString() {
        return "Caja [Ancho: " + ancho + ", Alto: " + alto + ", Fondo: " + fondo + "]";
    }
}