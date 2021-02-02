/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

//Introducir notas de 6 alumnos, y saber cuantos aprobaron y reprobaron
public class Ejercicio13 {

    public static void main(String[] args) {
       
        int notas = 0;
        
        int apro = 0, repro = 0, nerd = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {

            System.out.println("Introducir nota del 0 al 100: ");
            notas = sc.nextInt();

            if (notas < 60) {
                repro++;
            }

            if (notas >= 60) {
                apro++;
            }

            if (notas >= 95 && notas<=100) {
                nerd++;
            }

        }

        System.out.println("Alumnos Reprobados: " + repro);

        System.out.println("Alumnos Aprobados: " + apro);

        System.out.println("Alumnos Nerd: " + nerd);

    }

}
