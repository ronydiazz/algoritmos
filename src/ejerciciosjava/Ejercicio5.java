/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio5 {
    public static void main (String[] args){
    // Almacenar en un arreglo las 30 ventas del mes y que diga cuales son mayores a 2000
        double ventas[]=new double[30];
        Scanner sc=new Scanner(System.in);
         System.out.println("Ingrese las 30 ventas del mes \n");
        for (int i=0;i<ventas.length;i++){
            System.out.println("Venta "+(i+1));
            System.out.println("Venta "+(i));
            ventas[i]=sc.nextDouble();
        }
        int k=0;
        int total=0;
         System.out.println("Ventas mayores o igual a 2000 Gs.");
        while (k<30){
            if(ventas[k]>=2000){
        System.out.println("Gs."+ventas[k]);
            total++;
        
            }
            k++;
        }
         System.out.println("El total de ventas mayores a 2000 es:"+total);
    }

}
    
   
