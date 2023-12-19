/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversio;

import java.util.Scanner;

/**
 *
 * @author nil
 */
public class Conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sortir = 0;

        while (sortir == 0) {
            System.out.println("Quina opció vols elegir?");
            System.out.println("1. Euros a lliures esterlines");
            System.out.println("2. Lliures esterlines a euros");
            int opcio = sc.nextInt();

            if (opcio == 1) {
                System.out.println("Introdueix en lliures esterlines");
                int valor_esterlines = sc.nextInt();

                double tipus_de_canvi = 1.15d;
                System.out.println(valor_esterlines + " lliures esterlines (£) acatualment equivalen a " + (valor_esterlines * tipus_de_canvi) + " euros (€)");
            } else if (opcio == 2) {
                System.out.println("Introdueix en €");
                int valor_euros = sc.nextInt();

                double tipus_de_canvi = 1.15d;
                System.out.println(valor_euros + " euros (€) acatualment equivalen a " + (valor_euros / tipus_de_canvi) + " lliures esterlines (£)");
            } else {
                System.out.println("Opcio no valida");
                sortir = 1;
            }
        }
    }
}
