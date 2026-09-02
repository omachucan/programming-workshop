package com.doveoverlamb.sesion06;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        String sexo, sector;
        double transporte = 18000.00, salud = 15000.00, educacion = 12000.00, montoPagar = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println(" == BIENVENIDOS == ");
        System.out.print(" Ingrese su sexo ( M ó F ): ");
        sexo = entrada.nextLine();
        if (!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))) {
            System.out.print("Debe ingresar unicamente : \n M : Masculino \n F : Femenino ");
        } else {
            System.out.print(" Estos son los sectores : \n\t S : Salud \n\t T : Transporte \n\t E : Educacion \n Escoja uno:  ");
            sector = entrada.nextLine();

            if (sexo.equalsIgnoreCase("F")) {
                if (sector.equalsIgnoreCase("s")) {
                    montoPagar = salud * 1.25;  //montoPagar = salud + salud * 0.25;
                } else if (sector.equalsIgnoreCase("e")) {
                    montoPagar = educacion * 1.12;

                } else if (sector.equalsIgnoreCase("t")) {
                    montoPagar = transporte * 1.20;
                }
            } else {
                if (sector.equalsIgnoreCase("s")) {
                    montoPagar = salud * 1.20;
                } else if (sector.equalsIgnoreCase("e")) {
                    montoPagar = educacion * 1.11;

                } else if (sector.equalsIgnoreCase("t")) {
                    montoPagar = transporte * 1.15;
                }
            }
            
            System.out.printf("%nEl monto a pagar es : %.2f%n", montoPagar);
        }

        entrada.close();

    }
}
