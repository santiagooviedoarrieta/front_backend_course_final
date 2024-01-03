
package com.mycompany.mavenproject1;
public class CajaCarton extends Caja {
    private static final double FACTOR_DEFORMACION = 0.8;
    private static double superficieTotalCarton = 0;

    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo);
        calcularSuperficieCarton();
    }

    private void calcularSuperficieCarton() {
        double superficieBase = 2 * (getAncho() * getFondo() + getAncho() * getAlto() + getFondo() * getAlto());
        superficieTotalCarton += superficieBase * FACTOR_DEFORMACION;
    }

    public static double getSuperficieTotalCarton() {
        return superficieTotalCarton;
    }
}