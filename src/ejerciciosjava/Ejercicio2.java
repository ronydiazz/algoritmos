/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

public class Ejercicio2 {

    /*
           Muestra en consola tabla de multiplicar del N° 1 HASTA 10
     */
    public static void main(String[] args) {

        System.out.println("Usando el ciclo el ciclo for");

        for (int i = 1; i <= 10; i++) {

            System.out.println("Tabla de multiplicar del " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);

            }
        }
        
        System.out.println("\n\n Usando el ciclo While!");
        int i = 1;
        while (i <= 10) {
            for (int j = 1; j <= 10; j++) {
         System.out.println(i+"*"+j+"="+i*j);
            }
              i++;
        }
    }
}
