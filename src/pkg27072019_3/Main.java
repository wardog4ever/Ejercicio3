/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27072019_3;

import java.util.Scanner;

/**
 *
 * @author wardog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entradaDatos = new Scanner(System.in);
        int lado = 0,perimetro = 0;
        char continuar = 'n';
        /* 
        Actividad:
            Realizar la carga del lado de un cuadrado, mostrar por pantalla el perimetro del mismo.
        
         */
        System.out.println("Practica: conocer el perimetro de un cuadrado, solicitando uno de sus lados.\n");

        System.out.println("----------------------------------");

        for (int upside = 0; upside < 4; upside++) {

            System.out.println("****");

            if (upside == 2) {
                System.out.println("**** => Formula: 4 * L");
                upside++;
            }
        }

        System.out.println("----------------------------------");
        System.out.print("Ingresa la medida de uno de los lados: ");
        lado = entradaDatos.nextInt();
        
        System.out.print("Medida: "+lado+" Escorrecto? [S/n]..: ");
        continuar = entradaDatos.next().charAt(0);
        
        if(continuar == 'S' || continuar == 's'){
            
            perimetro = 4 * lado;
            System.out.println("El perimetro del cuadrado es => "+perimetro+"\n");
        }
        else
            System.exit(0);

    }

}
