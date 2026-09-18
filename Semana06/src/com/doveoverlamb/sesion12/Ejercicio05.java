package com.doveoverlamb.sesion12;

public class Ejercicio05 {

    public static void main(String[] args) {

        int numero = 10;

        System.out.println("\n==== REPORTE DE NUMEROS ====");

        while (numero >= 1) {

            if (numero == 5) {
                numero--;
                continue;
            } else {
                System.out.println(numero);
                numero--;
            }

        }

    }
}
