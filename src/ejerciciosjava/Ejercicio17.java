/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

//Guardar 10 numeros en un arreglo, y al final, mostrarlos en pantalla
//en el siguiente orden: el primero, el ultimo, el segunto, el penultimo
//el tercero
public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            arr[i] = sc.nextInt();
                   
        }
         System.out.println("Mostrar los numeros ");
       for(int i=0;i<5;i++){
       
       System.out.println(arr[i]);
       System.out.println(arr[9-i]);
       }
        
    }

}
