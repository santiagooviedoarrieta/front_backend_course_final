
package com.mycompany.mavenproject1;
public class Hora12 {
    private int hora;
    private int minuto;
    private String periodo;

    public Hora12(int hora, int minuto, String periodo) {
        setHora(hora);
        setMinutos(minuto);
        setPeriodo(periodo);
    }

    public void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 13) {
                hora = 1;
            }
        }
    }

    public void setMinutos(int valor) {
        try {
            if (valor >= 0 && valor <= 59) {
                minuto = valor;
            } else {
                throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setHora(int valor) {
        try {
            if (valor >= 1 && valor <= 12) {
                hora = valor;
            } else {
                throw new IllegalArgumentException("La hora debe estar entre 1 y 12");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setPeriodo(String valor) {
        try {
            if (valor.equalsIgnoreCase("am") || valor.equalsIgnoreCase("pm")) {
                periodo = valor.toLowerCase();
            } else {
                throw new IllegalArgumentException("El periodo debe ser 'am' o 'pm'");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d %s", hora, minuto, periodo);
    }
}
