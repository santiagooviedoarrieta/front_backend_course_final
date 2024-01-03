
package com.mycompany.mavenproject1;

public class Hora {
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        setHora(hora);
        setMinutos(minuto);
    }

    public void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
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
            if (valor >= 0 && valor <= 23) {
                hora = valor;
            } else {
                throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }
}